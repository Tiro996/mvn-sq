package com.feiqu.adminFramework.util;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RuntimeUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.system.SystemUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 命令行工具
 *
 * @author jiangzeyin
 * @date 2019/4/15
 */
public class CommandUtil {
    private static final Logger logger = LoggerFactory.getLogger(CommandUtil.class);
    /**
     * 系统命令
     */
    private static final List<String> COMMAND = new ArrayList<>();
    /**
     * 文件后缀
     */
    public static final String SUFFIX;

    static {
        if (SystemUtil.getOsInfo().isLinux()) {
            //执行linux系统命令
            COMMAND.add("/bin/sh");
            COMMAND.add("-c");
        } else if (SystemUtil.getOsInfo().isMac()) {
            COMMAND.add("/bin/sh");
            COMMAND.add("-c");
        } else {
            COMMAND.add("cmd");
            COMMAND.add("/c");
        }

        if (SystemUtil.getOsInfo().isWindows()) {
            SUFFIX = "bat";
        } else {
            SUFFIX = "sh";
        }
    }

    public static List<String> getCommand() {
        return ObjectUtil.clone(COMMAND);
    }


    public static String execSystemCommand(String command) {
        return execSystemCommand(command, null);
    }

    /**
     * 在指定文件夹下执行命令
     *
     * @param command 命令
     * @param file    文件夹
     * @return msg
     */
    public static String execSystemCommand(String command, File file) {
        String newCommand = StrUtil.replace(command, StrUtil.CRLF, StrUtil.SPACE);
        newCommand = StrUtil.replace(newCommand, StrUtil.LF, StrUtil.SPACE);
        String result = "error";
        try {
            List<String> commands = getCommand();
            commands.add(newCommand);
            String[] cmd = commands.toArray(new String[]{});
            result = exec(cmd, file);
        } catch (Exception e) {
            logger.error("执行命令异常", e);
            result += e.getMessage();
        }
        return result;
    }

    /**
     * 执行命令
     *
     * @param cmd 命令行
     * @return 结果
     * @throws IOException IO
     */
    private static String exec(String[] cmd, File file) throws IOException {
        logger.info(Arrays.toString(cmd));
        Process process = new ProcessBuilder(cmd).directory(file).redirectErrorStream(true).start();
        return RuntimeUtil.getResult(process);
    }

    /**
     * 异步执行命令
     *
     * @param file    文件夹
     * @param command 命令
     * @throws IOException 异常
     */
    public static void asyncExeLocalCommand(File file, String command) throws Exception {
        if (SystemUtil.getOsInfo().isWindows()) {
            execSystemCommand(command, file);
            return;
        }
        List<String> commands = getCommand();
        commands.add(command);
        ProcessBuilder pb = new ProcessBuilder(commands);
        pb.directory(file);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.start();
    }
}
