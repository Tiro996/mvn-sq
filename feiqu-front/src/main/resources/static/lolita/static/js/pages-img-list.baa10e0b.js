(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-img-list"],{"3a8b":function(e,t,i){"use strict";i.r(t);var n=i("66ea"),o=i.n(n);for(var a in n)"default"!==a&&function(e){i.d(t,e,function(){return n[e]})}(a);t["default"]=o.a},"3d8d":function(e,t,i){t=e.exports=i("2350")(!1),t.push([e.i,'@font-face{font-family:texticons;font-weight:400;font-style:normal;src:url(//at.alicdn.com/t/font_1057478_c5ratb41h0i.ttf) format("truetype")}.index-icon[data-v-2b1dff19]{width:%?40?%;height:%?60?%;font-size:%?36?%;text-align:center;font-family:texticons;margin-right:%?20?%}.card-img[data-v-2b1dff19]{width:355px;height:532px}.card[data-v-2b1dff19]{position:relative;width:355px;margin:10px 10px 10px 10px;border-radius:5px;overflow:hidden;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;-ms-flex-direction:column;flex-direction:column;background-color:#fff}.card .row[data-v-2b1dff19]{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-webkit-flex-direction:row;-ms-flex-direction:row;flex-direction:row;-webkit-box-pack:justify;-webkit-justify-content:space-between;-ms-flex-pack:justify;justify-content:space-between}.share-pic[data-v-2b1dff19]{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:end;-webkit-justify-content:flex-end;-ms-flex-pack:end;justify-content:flex-end;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-webkit-flex-direction:row;-ms-flex-direction:row;flex-direction:row}.car-title-view[data-v-2b1dff19]{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-webkit-flex-direction:row;-ms-flex-direction:row;flex-direction:row;max-width:90%}',""])},5937:function(e,t,i){"use strict";var n=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{staticClass:"index"},[e._l(e.list,function(t,n){return[i("v-uni-view",{key:n+"_0",staticClass:"card",on:{click:function(i){i=e.$handleEvent(i),e.goDetail(t)}}},[i("v-uni-image",{staticClass:"card-img",attrs:{src:t.imgUrl,mode:"aspectFill"}}),i("v-uni-text",{staticClass:"card-num-view"},[e._v(e._s(t.imgNum))]),i("v-uni-view",{staticClass:"row"},[i("v-uni-view",{staticClass:"car-title-view"},[i("v-uni-text",{staticClass:"card-title"},[e._v(e._s(t.title))])],1),i("v-uni-view",{staticClass:"share-pic"},[i("v-uni-text",{staticClass:"index-icon",on:{click:function(i){i.stopPropagation(),i=e.$handleEvent(i),e.share(t)}}},[e._v("")])],1)],1)],1)]}),i("v-uni-text",{staticClass:"loadMore"},[e._v("加载中...")])],2)},o=[];i.d(t,"a",function(){return n}),i.d(t,"b",function(){return o})},"66ea":function(e,t,i){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var n={data:function(){return{refreshing:!1,providerList:[],list:[],fetchPageNum:1}},onLoad:function(){var e=this;this.getData(),uni.getProvider({service:"share",success:function(t){for(var i=[],n=0;n<t.provider.length;n++)switch(t.provider[n]){case"weixin":i.push({name:"分享到微信好友",id:"weixin"}),i.push({name:"分享到微信朋友圈",id:"weixin",type:"WXSenceTimeline"});break;case"qq":i.push({name:"分享到QQ",id:"qq"});break;default:break}e.providerList=i},fail:function(e){console.log("获取登录通道失败",e)}})},onReachBottom:function(){console.log("滑动到页面底部"),this.getData()},onPullDownRefresh:function(){console.log("下拉刷新"),this.refreshing=!0,this.getData()},methods:{getData:function(){var e=this;uni.request({url:this.$serverUrl+"/beauty/list?index="+(this.refreshing?1:this.fetchPageNum),success:function(t){if(console.log("data",t),200!==t.statusCode)console.log("失败!");else{if(e.refreshing&&t.data[0].id===e.list[0].id)return uni.showToast({title:"已经最新",icon:"none"}),e.refreshing=!1,void uni.stopPullDownRefresh();var i=t.data.data.list;e.refreshing?(e.refreshing=!1,uni.stopPullDownRefresh(),e.list=i,e.fetchPageNum=2):(e.list=e.list.concat(i),e.fetchPageNum+=1)}}})},goDetail:function(e){uni.navigateTo({url:"../img/detail?data="+encodeURIComponent(JSON.stringify(e))})},share:function(e){var t=this;if(0!==this.providerList.length){var i=this.providerList.map(function(e){return e.name});uni.showActionSheet({itemList:i,success:function(i){uni.share({provider:t.providerList[i.tapIndex].id,scene:t.providerList[i.tapIndex].type&&"WXSenceTimeline"===t.providerList[i.tapIndex].type?"WXSenceTimeline":"WXSceneSession",type:0,title:"uni-app模版",summary:e.title,imageUrl:e.img_src,href:"https://uniapp.dcloud.io",success:function(e){console.log("success:"+JSON.stringify(e))},fail:function(e){uni.showModal({content:e.errMsg,showCancel:!1})}})}})}else uni.showModal({title:"当前环境无分享渠道!",showCancel:!1})}}};t.default=n},7050:function(e,t,i){"use strict";i.r(t);var n=i("5937"),o=i("3a8b");for(var a in o)"default"!==a&&function(e){i.d(t,e,function(){return o[e]})}(a);i("7cf2");var s=i("2877"),r=Object(s["a"])(o["default"],n["a"],n["b"],!1,null,"2b1dff19",null);t["default"]=r.exports},"7cf2":function(e,t,i){"use strict";var n=i("fd83"),o=i.n(n);o.a},fd83:function(e,t,i){var n=i("3d8d");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var o=i("4f06").default;o("cdb2de8e",n,!0,{sourceMap:!1,shadowMode:!1})}}]);