import{A as q,v as ae,q as te}from"./index.d4e6d621.js";/* empty css               *//* empty css              *//* empty css              *//* empty css              *//* empty css               *//* empty css               */import{u as oe}from"./loading.47953f7c.js";/* empty css               *//* empty css              */import{d as ue,j as s,b2 as ne,C as p,D as de,aM as a,aL as t,aQ as f,aR as b,u as B,aE as i,aF as m,aY as re,aW as pe,b6 as ie,bG as me,b5 as ve,bH as se,ba as ye,bI as ce,ac as fe,aZ as be,b9 as Ve,a6 as ge,bJ as ke,bL as $e,bM as _e,bN as Ce,bi as Ue,bE as we,bF as De}from"./arco.7ab11c03.js";import"./chart.35386b55.js";import"./vue.5b3e6270.js";function Ie(V,d,C,y,U){return q.post("/character/v1/online/list",{pageNo:V,pageSize:d,id:C,name:y,map:U})}function je(V){return q.post("/give/v1/resource",V)}function Se(V){return q.post("/common/v1/getEquipmentInfoByItemId",{id:V})}const Ae={class:"container",loading:!0},qe={name:"Player"},Oe=ue({...qe,setup(V){const{t:d}=ae.exports.useI18n(),{loading:C,setLoading:y}=oe(!1),U=s([]),z=s(0),g=s(1),D=s(14),v=s({id:void 0,name:void 0,map:void 0}),w=s(!1),I=s(""),e=s({worldId:void 0,playerId:void 0,player:void 0,type:0,id:void 0,quantity:void 0,rate:void 0,str:void 0,dex:void 0,int:void 0,luk:void 0,hp:void 0,mp:void 0,pAtk:void 0,mAtk:void 0,pDef:void 0,mDef:void 0,acc:void 0,avoid:void 0,hands:void 0,speed:void 0,jump:void 0,upgradeSlot:void 0,expire:void 0}),R={value:"value",label:"label"},j=s([{value:0,label:d("account.player.nxCredit")}]),k=async()=>{y(!0);try{const{data:l}=await Ie(g.value,D.value,v.value.id,v.value.name,v.value.map);U.value=l.records,z.value=l.totalRow}finally{y(!1)}};k();const x=()=>{g.value=1,k()},L=l=>{g.value=l,k()},T=l=>{g.value=1,D.value=l,k()},M=()=>{v.value.id=void 0,v.value.name=void 0,v.value.map=void 0,g.value=1,k()},G=()=>{I.value="\u5168\u670D\u53D1\u653E\u8D44\u6E90",j.value=[{value:0,label:d("account.player.nxCredit")},{value:1,label:d("account.player.nxPrepaid")},{value:2,label:d("account.player.maplePoint")},{value:3,label:d("account.player.mesos")},{value:4,label:d("account.player.exp")},{value:5,label:d("account.player.item")},{value:6,label:d("account.player.equip")}],e.value.worldId=void 0,e.value.playerId=0,e.value.player=void 0,w.value=!0},H=l=>{I.value="\u53D1\u653E\u8D44\u6E90",j.value=[{value:0,label:d("account.player.nxCredit")},{value:1,label:d("account.player.nxPrepaid")},{value:2,label:d("account.player.maplePoint")},{value:3,label:d("account.player.mesos")},{value:4,label:d("account.player.exp")},{value:5,label:d("account.player.item")},{value:6,label:d("account.player.equip")},{value:7,label:d("account.player.expRate")},{value:8,label:d("account.player.mesosRate")},{value:9,label:d("account.player.dropRate")},{value:11,label:d("account.player.gm")},{value:12,label:d("account.player.fame")}],e.value={worldId:l.world,playerId:l.id,player:l.name,type:0,id:void 0,quantity:void 0,rate:void 0,str:void 0,dex:void 0,int:void 0,luk:void 0,hp:void 0,mp:void 0,pAtk:void 0,mAtk:void 0,pDef:void 0,mDef:void 0,acc:void 0,avoid:void 0,hands:void 0,speed:void 0,jump:void 0,upgradeSlot:void 0,expire:void 0},w.value=!0},J=async()=>{y(!0);try{await je(e.value),re.success(d("message.success"))}finally{y(!1)}},O=async()=>{if(e.value.type===6){y(!0);try{const{data:l}=await Se(e.value.id);e.value.str=l.str,e.value.dex=l.dex,e.value.int=l.int,e.value.luk=l.luk,e.value.hp=l.hp,e.value.mp=l.mp,e.value.pAtk=l.patk,e.value.mAtk=l.matk,e.value.pDef=l.pdef,e.value.mDef=l.mdef,e.value.acc=l.acc,e.value.avoid=l.avoid,e.value.hands=l.hands,e.value.speed=l.speed,e.value.jump=l.jump,e.value.upgradeSlot=l.upgradeSlot,e.value.expire=l.expire}finally{y(!1)}}};return(l,o)=>{const Q=ne("Breadcrumb"),r=pe,n=ie,$=me,W=ve,S=se,P=ye,E=ce,Y=fe,_=be,F=te,A=Ve,Z=ge,c=ke,K=$e,X=_e,h=Ce,N=Ue,ee=we,le=De;return p(),de("div",Ae,[a(Q),a(h,{class:"general-card",title:l.$t("menu.account.player")},{default:t(()=>[a(S,{style:{"margin-bottom":"16px"}},{default:t(()=>[a($,{flex:1},{default:t(()=>[a(P,{model:v.value,"label-col-props":{span:8},"wrapper-col-props":{span:16}},{default:t(()=>[a(S,{gutter:16},{default:t(()=>[a($,{span:6},{default:t(()=>[a(n,{label:l.$t("account.player.id")},{default:t(()=>[a(r,{modelValue:v.value.id,"onUpdate:modelValue":o[0]||(o[0]=u=>v.value.id=u)},null,8,["modelValue"])]),_:1},8,["label"])]),_:1}),a($,{span:6},{default:t(()=>[a(n,{label:l.$t("account.player.name")},{default:t(()=>[a(W,{modelValue:v.value.name,"onUpdate:modelValue":o[1]||(o[1]=u=>v.value.name=u)},null,8,["modelValue"])]),_:1},8,["label"])]),_:1}),a($,{span:6},{default:t(()=>[a(n,{label:l.$t("account.player.mapId")},{default:t(()=>[a(r,{modelValue:v.value.map,"onUpdate:modelValue":o[2]||(o[2]=u=>v.value.map=u)},null,8,["modelValue"])]),_:1},8,["label"])]),_:1})]),_:1})]),_:1},8,["model"])]),_:1}),a(E,{style:{height:"84px"},direction:"vertical"}),a($,{flex:"86px",style:{"text-align":"right"}},{default:t(()=>[a(A,{direction:"vertical",size:18},{default:t(()=>[a(_,{type:"primary",onClick:o[3]||(o[3]=u=>k())},{icon:t(()=>[a(Y)]),default:t(()=>[f(" "+b(l.$t("button.load")),1)]),_:1}),a(_,{onClick:M},{icon:t(()=>[a(F)]),default:t(()=>[f(" "+b(l.$t("button.reset")),1)]),_:1})]),_:1})]),_:1})]),_:1}),a(E),a(S,{style:{"margin-bottom":"16px"}},{default:t(()=>[a($,null,{default:t(()=>[a(A,null,{default:t(()=>[a(_,{type:"primary",onClick:x},{icon:t(()=>[a(F)]),default:t(()=>[f(" "+b(l.$t("button.refresh")),1)]),_:1}),a(_,{type:"primary",onClick:G},{icon:t(()=>[a(Z)]),default:t(()=>[f(" "+b(l.$t("account.player.button.globalGive")),1)]),_:1})]),_:1})]),_:1})]),_:1}),a(K,{"row-key":"id",loading:B(C),data:U.value,"column-resizable":"",pagination:!1,bordered:{cell:!0},scroll:{y:"calc(100vh - 502px)"}},{columns:t(()=>[a(c,{title:l.$t("account.player.id"),"data-index":"id",width:100,align:"center"},null,8,["title"]),a(c,{title:l.$t("account.player.name"),"data-index":"name",width:200,align:"center"},null,8,["title"]),a(c,{title:l.$t("account.player.map"),"data-index":"map",width:200,align:"center"},null,8,["title"]),a(c,{title:l.$t("account.player.job"),"data-index":"job",width:200,align:"center"},null,8,["title"]),a(c,{title:l.$t("account.player.jobName"),"data-index":"jobName",width:200,align:"center"},null,8,["title"]),a(c,{title:l.$t("account.player.level"),"data-index":"level",width:200,align:"center"},null,8,["title"]),a(c,{title:l.$t("account.player.gm.level"),"data-index":"gm",width:200,align:"center"},null,8,["title"]),a(c,{title:l.$t("account.list.column.operate")},{cell:t(({record:u})=>[a(_,{type:"text",size:"mini",onClick:ze=>H(u)},{default:t(()=>[f(b(l.$t("account.player.button.give")),1)]),_:2},1032,["onClick"])]),_:1},8,["title"])]),_:1},8,["loading","data"]),a(X,{style:{"margin-top":"20px"},total:z.value,"page-size":D.value,current:g.value,"show-total":"","show-jumper":"","show-page-size":"","page-size-options":[7,14,35,70],onChange:L,onPageSizeChange:T},null,8,["total","page-size","current"])]),_:1},8,["title"]),a(le,{visible:w.value,"onUpdate:visible":o[25]||(o[25]=u=>w.value=u),title:I.value,"ok-loading":B(C),"mask-closable":!1,"esc-to-close":!1,"ok-text":l.$t("account.player.give"),"on-before-ok":J},{default:t(()=>[a(P,{model:e.value},{default:t(()=>[e.value.playerId!==0?(p(),i(n,{key:0,label:l.$t("account.player.form.player")},{default:t(()=>[a(A,null,{default:t(()=>[a(N,{color:"red"},{default:t(()=>[f(b(e.value.playerId),1)]),_:1}),a(N,{color:"blue"},{default:t(()=>[f(b(e.value.player),1)]),_:1})]),_:1})]),_:1},8,["label"])):m("",!0),a(n,{label:l.$t("account.player.form.type")},{default:t(()=>[a(ee,{modelValue:e.value.type,"onUpdate:modelValue":o[4]||(o[4]=u=>e.value.type=u),options:j.value,"field-names":R},null,8,["modelValue","options"])]),_:1},8,["label"]),e.value.type===5||e.value.type===6?(p(),i(n,{key:1,label:l.$t("account.player.form.id")},{default:t(()=>[a(r,{modelValue:e.value.id,"onUpdate:modelValue":o[5]||(o[5]=u=>e.value.id=u),onChange:O},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type<6||e.value.type===11||e.value.type===12?(p(),i(n,{key:2,label:l.$t("account.player.form.quantity")},{default:t(()=>[a(r,{modelValue:e.value.quantity,"onUpdate:modelValue":o[6]||(o[6]=u=>e.value.quantity=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type>6&&e.value.type<11?(p(),i(n,{key:3,label:l.$t("account.player.form.rate"),rules:[{required:!0,message:l.$t("account.player.form.rate.required")},{type:"number",min:3,message:l.$t("account.player.form.rate.type")}],"validate-trigger":["change","input"]},{default:t(()=>[a(r,{modelValue:e.value.rate,"onUpdate:modelValue":o[7]||(o[7]=u=>e.value.rate=u)},null,8,["modelValue"])]),_:1},8,["label","rules"])):m("",!0),e.value.type===6?(p(),i(n,{key:4,label:l.$t("account.player.form.str")},{default:t(()=>[a(r,{modelValue:e.value.str,"onUpdate:modelValue":o[8]||(o[8]=u=>e.value.str=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:5,label:l.$t("account.player.form.dex")},{default:t(()=>[a(r,{modelValue:e.value.dex,"onUpdate:modelValue":o[9]||(o[9]=u=>e.value.dex=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:6,label:l.$t("account.player.form.int")},{default:t(()=>[a(r,{modelValue:e.value.int,"onUpdate:modelValue":o[10]||(o[10]=u=>e.value.int=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:7,label:l.$t("account.player.form.luk")},{default:t(()=>[a(r,{modelValue:e.value.luk,"onUpdate:modelValue":o[11]||(o[11]=u=>e.value.luk=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:8,label:l.$t("account.player.form.hp")},{default:t(()=>[a(r,{modelValue:e.value.hp,"onUpdate:modelValue":o[12]||(o[12]=u=>e.value.hp=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:9,label:l.$t("account.player.form.mp")},{default:t(()=>[a(r,{modelValue:e.value.mp,"onUpdate:modelValue":o[13]||(o[13]=u=>e.value.mp=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:10,label:l.$t("account.player.form.pAtk")},{default:t(()=>[a(r,{modelValue:e.value.pAtk,"onUpdate:modelValue":o[14]||(o[14]=u=>e.value.pAtk=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:11,label:l.$t("account.player.form.mAtk")},{default:t(()=>[a(r,{modelValue:e.value.mAtk,"onUpdate:modelValue":o[15]||(o[15]=u=>e.value.mAtk=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:12,label:l.$t("account.player.form.pDef")},{default:t(()=>[a(r,{modelValue:e.value.pDef,"onUpdate:modelValue":o[16]||(o[16]=u=>e.value.pDef=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:13,label:l.$t("account.player.form.mDef")},{default:t(()=>[a(r,{modelValue:e.value.mDef,"onUpdate:modelValue":o[17]||(o[17]=u=>e.value.mDef=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:14,label:l.$t("account.player.form.acc")},{default:t(()=>[a(r,{modelValue:e.value.acc,"onUpdate:modelValue":o[18]||(o[18]=u=>e.value.acc=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:15,label:l.$t("account.player.form.avoid")},{default:t(()=>[a(r,{modelValue:e.value.avoid,"onUpdate:modelValue":o[19]||(o[19]=u=>e.value.avoid=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:16,label:l.$t("account.player.form.hands")},{default:t(()=>[a(r,{modelValue:e.value.hands,"onUpdate:modelValue":o[20]||(o[20]=u=>e.value.hands=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:17,label:l.$t("account.player.form.speed")},{default:t(()=>[a(r,{modelValue:e.value.speed,"onUpdate:modelValue":o[21]||(o[21]=u=>e.value.speed=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:18,label:l.$t("account.player.form.jump")},{default:t(()=>[a(r,{modelValue:e.value.jump,"onUpdate:modelValue":o[22]||(o[22]=u=>e.value.jump=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:19,label:l.$t("account.player.form.upgradeSlot")},{default:t(()=>[a(r,{modelValue:e.value.upgradeSlot,"onUpdate:modelValue":o[23]||(o[23]=u=>e.value.upgradeSlot=u)},null,8,["modelValue"])]),_:1},8,["label"])):m("",!0),e.value.type===6?(p(),i(n,{key:20,label:l.$t("account.player.form.expire")},{default:t(()=>[a(r,{modelValue:e.value.expire,"onUpdate:modelValue":o[24]||(o[24]=u=>e.value.expire=u),placeholder:l.$t("account.player.form.expire.placeholder")},null,8,["modelValue","placeholder"])]),_:1},8,["label"])):m("",!0)]),_:1},8,["model"])]),_:1},8,["visible","title","ok-loading","ok-text"])])}}});export{Oe as default};