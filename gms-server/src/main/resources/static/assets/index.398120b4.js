import{A as N}from"./index.d4e6d621.js";/* empty css               *//* empty css               */import{d as M,j as _,C as v,aE as k,aL as l,aQ as u,G as $,aM as e,aR as s,u as U,bT as C,aY as G,b6 as K,b9 as W,aW as j,aX as se,bD as J,bE as Q,ba as X,bF as Y,r as me,D as z,aF as H,aO as I,aN as T,aZ as fe,bG as ve,bH as pe,bJ as ce,bi as _e,bL as be,bM as Ce,bN as Z,b2 as ye,bU as ge,bV as ke}from"./arco.7ab11c03.js";/* empty css               *//* empty css              *//* empty css              *//* empty css              *//* empty css              *//* empty css               */import{u as q}from"./loading.47953f7c.js";import{g as ee}from"./mapleStoryAPI.7ca30bdd.js";import"./chart.35386b55.js";import"./vue.5b3e6270.js";function Ee(){return N.get("/cashShop/v1/getAllCategoryList")}function Fe(V){return N.post("/cashShop/v1/getCommodityByCategory",V)}function Ve(V){return N.post("/cashShop/v1/onSale",V)}function Be(V){return N.post("/cashShop/v1/offSale",V)}function xe(V){return N.post("/cashShop/v1/batchOnSale",V)}const Se=["src"],we={name:"CashShopForm"},Pe=M({...we,emits:["loadData"],setup(V,{expose:h,emit:B}){const{setLoading:P,loading:S}=q(!1),y=_(!1),a=_({sn:-1,itemId:-1}),t=_({sn:-1,itemId:-1}),L=B,g=async()=>{P(!0);try{a.value.onSale?await Ve(a.value):await Be(a.value),y.value=!1,G.success("\u66F4\u65B0\u6210\u529F\uFF01"),L("loadData")}finally{P(!1)}},c=()=>{y.value=!1};return h({initForm:i=>{t.value=i,a.value={sn:i.sn,itemId:i.itemId,count:i.count,price:i.price,bonus:i.bonus,priority:i.priority,period:i.period,maplePoint:i.maplePoint,meso:i.meso,forPremiumUser:i.forPremiumUser,commodityGender:i.gender,onSale:i.onSale?1:0,clz:i.clz,limit:i.limit,pbCash:i.pbCash,pbPoint:i.pbPoint,pbGift:i.pbGift,packageSn:i.packageSn},y.value=!0}}),(i,o)=>{const r=K,A=W,p=j,F=se,w=J,b=Q,m=X,D=Y;return v(),k(D,{visible:y.value,"onUpdate:visible":o[16]||(o[16]=d=>y.value=d),"ok-loading":U(S),"on-before-ok":g,onCancel:c},{title:l(()=>[u(" \u7F16\u8F91\u5546\u54C1 ")]),default:l(()=>[$("div",null,[e(m,{model:a.value},{default:l(()=>[e(r,{label:"sn"},{default:l(()=>[u(s(a.value.sn),1)]),_:1}),e(r,{label:"\u7269\u54C1"},{default:l(()=>[e(A,null,{default:l(()=>[u(s(a.value.itemId)+" ",1),$("img",{src:U(ee)("item",a.value.itemId),alt:""},null,8,Se)]),_:1})]),_:1}),e(r,{label:"\u6570\u91CF"},C({default:l(()=>[e(p,{modelValue:a.value.count,"onUpdate:modelValue":o[0]||(o[0]=d=>a.value.count=d)},null,8,["modelValue"])]),_:2},[t.value.defaultCount?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultCount),1)]),key:"0"}:void 0]),1024),e(r,{label:"\u4EF7\u683C"},C({default:l(()=>[e(p,{modelValue:a.value.price,"onUpdate:modelValue":o[1]||(o[1]=d=>a.value.price=d)},null,8,["modelValue"])]),_:2},[t.value.defaultPrice?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultPrice),1)]),key:"0"}:void 0]),1024),e(r,{label:"\u4F18\u5148\u7EA7"},C({default:l(()=>[e(p,{modelValue:a.value.priority,"onUpdate:modelValue":o[2]||(o[2]=d=>a.value.priority=d)},null,8,["modelValue"])]),_:2},[t.value.defaultPriority?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultPriority),1)]),key:"0"}:void 0]),1024),e(r,{label:"\u6709\u6548\u671F"},C({default:l(()=>[e(p,{modelValue:a.value.period,"onUpdate:modelValue":o[3]||(o[3]=d=>a.value.period=d)},null,8,["modelValue"])]),_:2},[t.value.defaultPeriod?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultPeriod),1)]),key:"0"}:void 0]),1024),e(r,{label:"\u72B6\u6001"},{extra:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultOnSale?"\u4E0A\u67B6\u4E2D":"\u5F85\u552E"),1)]),default:l(()=>[e(F,{modelValue:a.value.onSale,"onUpdate:modelValue":o[4]||(o[4]=d=>a.value.onSale=d),type:"round","checked-value":1,"unchecked-value":0},{checked:l(()=>[u(" \u4E0A\u67B6\u4E2D ")]),unchecked:l(()=>[u(" \u5F85\u552E ")]),_:1},8,["modelValue"])]),_:1}),e(r,{label:"Bonus"},C({default:l(()=>[e(p,{modelValue:a.value.bonus,"onUpdate:modelValue":o[5]||(o[5]=d=>a.value.bonus=d)},null,8,["modelValue"])]),_:2},[t.value.defaultBonus?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultBonus),1)]),key:"0"}:void 0]),1024),e(r,{label:"\u62B5\u7528\u5238"},C({default:l(()=>[e(p,{modelValue:a.value.maplePoint,"onUpdate:modelValue":o[6]||(o[6]=d=>a.value.maplePoint=d)},null,8,["modelValue"])]),_:2},[t.value.defaultMaplePoint?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultMaplePoint),1)]),key:"0"}:void 0]),1024),e(r,{label:"\u91D1\u5E01"},C({default:l(()=>[e(p,{modelValue:a.value.meso,"onUpdate:modelValue":o[7]||(o[7]=d=>a.value.meso=d)},null,8,["modelValue"])]),_:2},[t.value.defaultMeso?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultMeso),1)]),key:"0"}:void 0]),1024),e(r,{label:"PremiumUser"},C({default:l(()=>[e(p,{modelValue:a.value.forPremiumUser,"onUpdate:modelValue":o[8]||(o[8]=d=>a.value.forPremiumUser=d)},null,8,["modelValue"])]),_:2},[t.value.defaultForPremiumUser?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultForPremiumUser),1)]),key:"0"}:void 0]),1024),e(r,{label:"\u6027\u522B"},{extra:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultGender===0?"\u7537":t.value.defaultGender===1?"\u5973":t.value.defaultGender===2?"\u901A\u7528":""),1)]),default:l(()=>[e(b,{modelValue:a.value.commodityGender,"onUpdate:modelValue":o[9]||(o[9]=d=>a.value.commodityGender=d)},{default:l(()=>[e(w,{value:0},{default:l(()=>[u("\u7537")]),_:1}),e(w,{value:1},{default:l(()=>[u("\u5973")]),_:1}),e(w,{value:2},{default:l(()=>[u("\u901A\u7528")]),_:1})]),_:1},8,["modelValue"])]),_:1}),e(r,{label:"\u6807\u7B7E"},C({default:l(()=>[e(b,{modelValue:a.value.clz,"onUpdate:modelValue":o[10]||(o[10]=d=>a.value.clz=d),"allow-clear":""},{default:l(()=>[e(w,{value:0},{default:l(()=>[u("NEW")]),_:1}),e(w,{value:1},{default:l(()=>[u("SALE")]),_:1}),e(w,{value:2},{default:l(()=>[u("HOT")]),_:1}),e(w,{value:3},{default:l(()=>[u("EVENT")]),_:1})]),_:1},8,["modelValue"])]),_:2},[t.value.defaultClz?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultClz===0?"NEW":t.value.defaultClz===1?"SALE":t.value.defaultClz===2?"HOT":t.value.defaultClz===3?"EVENT":""),1)]),key:"0"}:void 0]),1024),e(r,{label:"Limit"},C({default:l(()=>[e(p,{modelValue:a.value.limit,"onUpdate:modelValue":o[11]||(o[11]=d=>a.value.limit=d)},null,8,["modelValue"])]),_:2},[t.value.defaultLimit?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultLimit),1)]),key:"0"}:void 0]),1024),e(r,{label:"pbCash"},C({default:l(()=>[e(p,{modelValue:a.value.pbCash,"onUpdate:modelValue":o[12]||(o[12]=d=>a.value.pbCash=d)},null,8,["modelValue"])]),_:2},[t.value.defaultPBCash?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultPBCash),1)]),key:"0"}:void 0]),1024),e(r,{label:"pbPoint"},C({default:l(()=>[e(p,{modelValue:a.value.pbPoint,"onUpdate:modelValue":o[13]||(o[13]=d=>a.value.pbPoint=d)},null,8,["modelValue"])]),_:2},[t.value.defaultPBPoint?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultPBPoint),1)]),key:"0"}:void 0]),1024),e(r,{label:"pbGift"},C({default:l(()=>[e(p,{modelValue:a.value.pbGift,"onUpdate:modelValue":o[14]||(o[14]=d=>a.value.pbGift=d)},null,8,["modelValue"])]),_:2},[t.value.defaultPBGift?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultPBGift),1)]),key:"0"}:void 0]),1024),e(r,{label:"packageSn"},C({default:l(()=>[e(p,{modelValue:a.value.packageSn,"onUpdate:modelValue":o[15]||(o[15]=d=>a.value.packageSn=d)},null,8,["modelValue"])]),_:2},[t.value.defaultPackageSn?{name:"extra",fn:l(()=>[u(" wz\u9ED8\u8BA4\u503C "+s(t.value.defaultPackageSn),1)]),key:"0"}:void 0]),1024)]),_:1},8,["model"])])]),_:1},8,["visible","ok-loading"])}}}),De=["src","alt"],he={name:"CashShopTable"},Ae=M({...he,props:{topId:{},subId:{}},setup(V){const{loading:h,setLoading:B}=q(!1),P=V,S=_([]),y=_(0),a=_({id:1,subId:0,onSale:1,pageNo:1,itemId:void 0}),t=_([]),L=me({type:"checkbox",showCheckedAll:!0,onlyCurrent:!0}),g=b=>{a.value.pageNo=b,c()},c=async()=>{B(!0);try{const{data:b}=await Fe(a.value);S.value=b.records,y.value=b.totalRow}finally{B(!1)}};a.value.id=P.topId,a.value.subId=P.subId,c();const E=b=>{a.value.onSale=b,c()},i=_(),o=b=>{i.value.initForm(b)},r=_(!1),A=()=>{F.value={data:[],type:"\u4EF7\u683C",value:void 0},t.value.forEach(b=>{S.value.forEach(m=>{m.sn===b&&F.value.data.push(m)})}),r.value=!0},p=[{value:"\u4EF7\u683C"},{value:"\u6570\u91CF"},{value:"\u6709\u6548\u671F"}],F=_({data:[],type:"\u4EF7\u683C",value:void 0}),w=async()=>{if(F.value.data.length===0){G.error("\u4F60\u6CA1\u6709\u9009\u4E2D\u4EFB\u4F55\u4E1C\u897F");return}if(F.value.value===void 0){G.error("\u66F4\u65B0\u503Cundefined");return}B(!0);try{await xe(F.value),G.success("\u66F4\u65B0\u6210\u529F\uFF01"),await c()}finally{B(!1)}};return(b,m)=>{const D=fe,d=j,R=W,le=ve,ae=pe,f=ce,x=_e,ue=be,te=Ce,oe=Z,O=K,ne=J,de=Q,ie=X,re=Y;return v(),z(I,null,[e(oe,{class:"general-card"},{default:l(()=>[e(ae,null,{default:l(()=>[e(le,null,{default:l(()=>[e(R,null,{default:l(()=>[e(D,{disabled:a.value.onSale===1,type:"primary",status:"success",onClick:m[0]||(m[0]=n=>E(1))},{default:l(()=>[u(" \u4E0A\u67B6\u4E2D ")]),_:1},8,["disabled"]),e(D,{disabled:a.value.onSale===0,type:"primary",status:"danger",onClick:m[1]||(m[1]=n=>E(0))},{default:l(()=>[u(" \u5F85\u552E ")]),_:1},8,["disabled"]),e(D,{disabled:a.value.onSale===void 0,type:"primary",onClick:m[2]||(m[2]=n=>E(void 0))},{default:l(()=>[u(" \u5168\u90E8 ")]),_:1},8,["disabled"]),e(d,{modelValue:a.value.itemId,"onUpdate:modelValue":m[3]||(m[3]=n=>a.value.itemId=n),placeholder:"\u7269\u54C1ID"},null,8,["modelValue"]),e(D,{onClick:c},{default:l(()=>[u("\u641C\u7D22")]),_:1}),e(D,{type:"primary",onClick:A},{default:l(()=>[u("\u6279\u91CF\u7F16\u8F91")]),_:1})]),_:1})]),_:1})]),_:1}),e(ue,{selectedKeys:t.value,"onUpdate:selectedKeys":m[4]||(m[4]=n=>t.value=n),"row-key":"sn",loading:U(h),data:S.value,"column-resizable":"",pagination:!1,bordered:{cell:!0},scroll:{x:2e3},"row-selection":L},{columns:l(()=>[e(f,{title:"SN","data-index":"sn",align:"center",width:140,fixed:"left"}),e(f,{title:"\u7269\u54C1\u56FE\u6807",align:"center",width:100,fixed:"left"},{cell:l(({record:n})=>[$("img",{src:U(ee)("item",n.itemId),alt:n.itemId},null,8,De)]),_:1}),e(f,{title:"\u7269\u54C1ID","data-index":"itemId",align:"center",width:140,fixed:"left"}),e(f,{title:"\u7269\u54C1\u540D\u79F0","data-index":"itemName",align:"center",width:140,fixed:"left"}),e(f,{title:"\u6570\u91CF","data-index":"count",align:"center",width:80}),e(f,{title:"\u4F18\u5148\u7EA7","data-index":"priority",align:"center",width:80}),e(f,{title:"\u552E\u4EF7","data-index":"price",align:"center",width:120}),e(f,{title:"Bonus","data-index":"bonus",align:"center"}),e(f,{title:"\u6709\u6548\u671F","data-index":"period",align:"center",width:120},{cell:l(({record:n})=>[u(s(n.period)+" \u5929 ",1)]),_:1}),e(f,{title:"\u62B5\u7528\u5238","data-index":"maplePoint",align:"center"}),e(f,{title:"\u91D1\u5E01","data-index":"meso",align:"center"}),e(f,{title:"\u4F1A\u5458\u4E13\u5C5E","data-index":"forPremiumUser",align:"center"}),e(f,{title:"\u6027\u522B",align:"center"},{cell:l(({record:n})=>[n.gender===0?(v(),k(x,{key:0,color:"blue"},{default:l(()=>[u(" \u7537 ")]),_:1})):n.gender===1?(v(),k(x,{key:1,color:"red"},{default:l(()=>[u(" \u5973 ")]),_:1})):n.gender===2?(v(),k(x,{key:2,color:"green"},{default:l(()=>[u(" \u901A\u7528 ")]),_:1})):H("",!0)]),_:1}),e(f,{title:"\u4E0A\u67B6","data-index":"onSale",align:"center",width:120},{cell:l(({record:n})=>[n.onSale?(v(),k(x,{key:0,color:"green"},{default:l(()=>[u("\u4E0A\u67B6\u4E2D")]),_:1})):(v(),k(x,{key:1,color:"red"},{default:l(()=>[u("\u5F85\u552E")]),_:1}))]),_:1}),e(f,{title:"\u6807\u7B7E",align:"center"},{cell:l(({record:n})=>[n.clz===0?(v(),k(x,{key:0,color:"gold"},{default:l(()=>[u("NEW")]),_:1})):n.clz===1?(v(),k(x,{key:1,color:"green"},{default:l(()=>[u("SALE")]),_:1})):n.clz===2?(v(),k(x,{key:2,color:"orangered"},{default:l(()=>[u("HOT")]),_:1})):n.clz===3?(v(),k(x,{key:3,color:"blue"},{default:l(()=>[u("EVENT")]),_:1})):H("",!0)]),_:1}),e(f,{title:"Limit","data-index":"limit",align:"center"}),e(f,{title:"PbCash","data-index":"pbCash",align:"center"}),e(f,{title:"PbPoint","data-index":"pbPoint",align:"center"}),e(f,{title:"PbGift","data-index":"pbGift",align:"center"}),e(f,{title:"\u793C\u5305\u5408\u96C6","data-index":"packageSn",align:"center"}),e(f,{title:"\u64CD\u4F5C",fixed:"right"},{cell:l(({record:n})=>[e(D,{type:"text",size:"mini",onClick:Ie=>o(n)},{default:l(()=>[u(" \u7F16\u8F91 ")]),_:2},1032,["onClick"])]),_:1})]),_:1},8,["selectedKeys","loading","data","row-selection"]),e(te,{style:{"margin-top":"20px"},total:y.value,current:a.value.pageNo,"show-total":"","show-jumper":"",onChange:g},null,8,["total","current"])]),_:1}),e(Pe,{ref_key:"cashShopFormRef",ref:i,onLoadData:c},null,512),e(re,{visible:r.value,"onUpdate:visible":m[7]||(m[7]=n=>r.value=n),"ok-loading":U(h),title:"\u6279\u91CF\u7F16\u8F91","on-before-ok":w},{default:l(()=>[e(ie,{model:F.value},{default:l(()=>[e(O,{label:"\u5DF2\u9009\u4E2DSN"},{default:l(()=>[e(R,{wrap:""},{default:l(()=>[(v(!0),z(I,null,T(t.value,n=>(v(),k(x,{key:n,color:"blue"},{default:l(()=>[u(s(n),1)]),_:2},1024))),128))]),_:1})]),_:1}),e(O,{label:"\u7F16\u8F91\u7C7B\u578B"},{default:l(()=>[e(de,{modelValue:F.value.type,"onUpdate:modelValue":m[5]||(m[5]=n=>F.value.type=n)},{default:l(()=>[(v(),z(I,null,T(p,n=>e(ne,{key:n.value,value:n.value,label:n.value},null,8,["value","label"])),64))]),_:1},8,["modelValue"])]),_:1}),e(O,{label:"\u503C"},{default:l(()=>[e(d,{modelValue:F.value.value,"onUpdate:modelValue":m[6]||(m[6]=n=>F.value.value=n)},null,8,["modelValue"])]),_:1})]),_:1},8,["model"])]),_:1},8,["visible","ok-loading"])],64)}}}),ze={class:"container"},Ue={name:"CashShop"},Xe=M({...Ue,setup(V){const h=_([]),B=_([]),P=_([]),S=_(1),y=_(0),a=g=>{S.value=g,B.value=P.value.filter(c=>c.id===g),y.value=0},t=g=>{y.value=g};return(async()=>{const{data:g}=await Ee();P.value=g;const c=h.value;g.forEach(E=>{if(E.id===8)return;let i=!1;for(let o=0;o<c.length;o+=1)if(c[o].id===E.id){i=!0;break}i||c.push(E),E.id===1&&B.value.push(E)})})(),(g,c)=>{const E=ye("Breadcrumb"),i=ge,o=ke,r=Z;return v(),z("div",ze,[e(E),e(r,{class:"general-card",title:g.$t("menu.game.cashShop")},{default:l(()=>[e(o,{"lazy-load":"","destroy-on-hide":"",type:"card-gutter","default-active-key":1,"active-key":S.value,onChange:a},{default:l(()=>[(v(!0),z(I,null,T(h.value,A=>(v(),k(i,{key:A.id},{title:l(()=>[u(s(A.name),1)]),default:l(()=>[e(o,{"lazy-load":"","destroy-on-hide":"",type:"text","default-active-key":0,"active-key":y.value,onChange:t},{default:l(()=>[(v(!0),z(I,null,T(B.value,p=>(v(),k(i,{key:p.subId},{title:l(()=>[u(s(p.subName),1)]),default:l(()=>[e(Ae,{"top-id":S.value,"sub-id":y.value},null,8,["top-id","sub-id"])]),_:2},1024))),128))]),_:1},8,["active-key"])]),_:2},1024))),128))]),_:1},8,["active-key"])]),_:1},8,["title"])])}}});export{Xe as default};
