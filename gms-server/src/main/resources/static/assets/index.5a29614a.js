import{A as _,v as $e}from"./index.d4e6d621.js";/* empty css               *//* empty css              *//* empty css               *//* empty css              *//* empty css              *//* empty css               *//* empty css              *//* empty css               */import{u as Se}from"./loading.47953f7c.js";import{d as he,j as c,r as je,b2 as De,C as d,D as k,aM as l,aL as t,aO as w,aN as $,aE as y,aQ as s,aR as u,u as Le,aF as Z,G as O,bP as Ne,bQ as Ue,b6 as Be,b5 as Fe,aZ as Ie,b9 as Re,bG as Oe,bH as qe,bi as xe,bJ as Ae,bL as Me,bM as Ge,bD as Ee,bE as Ke,aX as Ye,bR as Pe,ba as Qe,bF as He,bS as Je,bN as Xe}from"./arco.7ab11c03.js";import"./chart.35386b55.js";import"./vue.5b3e6270.js";function Ze(){return _.get("/config/v1/getConfigTypeList")}function We(r){return _.post("/config/v1/getConfigList",r)}function ea(r){return _.post("/config/v1/addConfig",r)}function aa(r){return _.post("/config/v1/updateConfig",r)}function la(r){return _.post("/config/v1/deleteConfigList",r)}function ta(r){const f=new FormData;return f.append("file",r.fileItem.file),_.post(r.action,f,{headers:{"Content-type":"multipart/form-data"}}).then(S=>{r.onSuccess(S)})}function oa(){return _.get("/config/v1/exportYml",{responseType:"blob"})}const na={class:"container"},ia={style:{color:"red","font-size":"16px"}},ua={name:"Config"},za=he({...ua,setup(r){const{t:f}=$e.exports.useI18n(),S=c([]),q=c([]),x=c([]),A=c([]),i=c({type:"all",subType:"All",filter:"",pageNo:1,pageSize:20}),M=c([]),G=c(0),{loading:W,setLoading:C}=Se(!1),T=c([]),V=c(!1),j=c(""),o=je({id:0,configType:"server",configSubType:"Game Mechanics",configClazz:"java.lang.String",configCode:"",configValue:"",configDesc:""}),E=c(["java.lang.Integer","java.lang.String","java.lang.Float","java.lang.Boolean"]),ee=c([...E.value,"java.lang.Long","java.lang.Byte","java.lang.Short","java.lang.Double","java.util.Map"]),D=c(!1),h=c(!1),K=c(),Y=c([]),ae=async()=>{const{data:e}=await Ze();q.value=e.types,S.value=["all",...e.types],A.value=e.subTypes,x.value=["All",...e.subTypes]},z=(e,n)=>{e=e.replace(" ","");let m;return n?Number.isFinite(Number(e))?m=f("config.type.world")+e:m=f(`config.subType.${e}`):m=f(`config.type.${e}`),m==null?e:m},P=e=>{const n=L(e);return f(`config.clz.${n}`)},L=e=>{let n;switch(e){case"java.lang.Integer":case"java.lang.Long":case"java.lang.Byte":case"java.lang.Short":n="int";break;case"java.lang.Float":case"java.lang.Double":n="float";break;case"java.lang.Boolean":n="bool";break;default:n="string";break}return n},p=async()=>{C(!0);try{const e={...i.value,type:i.value.type==="all"?"":i.value.type,subType:i.value.subType==="All"?"":i.value.subType},{data:n}=await We(e);M.value=n.records,G.value=n.totalRow,T.value=[]}finally{C(!1)}},le=e=>{i.value.pageNo=e,p()},te=e=>{i.value.pageNo=1,i.value.pageSize=e,p()},oe=async()=>{await p()},ne=()=>{i.value.type="all",i.value.subType="All",i.value.filter="",i.value.pageNo=1,i.value.pageSize=20},ie=async e=>{i.value.type=String(e),await p()},ue=async e=>{i.value.subType=String(e),await p()},se=()=>{Q(),V.value=!0,j.value=f("button.add")},ce=async()=>{D.value=!0},de=e=>{o.id=e.id,o.configType=e.configType,o.configSubType=e.configSubType,o.configClazz=e.configClazz,o.configCode=e.configCode,o.configValue=e.configValue,o.configDesc=e.configDesc,V.value=!0,j.value=f("button.edit")},re=async()=>{o.id?await aa(o):await ea(o),Q(),V.value=!1,await p()},Q=()=>{o.id=0,o.configType="server",o.configSubType="Game Mechanics",o.configClazz="java.lang.String",o.configCode="",o.configValue="",o.configDesc=""},fe=async()=>{await la(T.value),await p()},ge=async()=>{h.value=!0},pe=async()=>{K.value.submit()},me=e=>{C(!0);try{ta(e)}finally{C(!1)}},be=async()=>{h.value=!1,Y.value=[],await p()},ve=async()=>{C(!0);try{await oa()}finally{C(!1)}};return ae(),(e,n)=>{const m=De("Breadcrumb"),H=Ne,J=Ue,g=Be,N=Fe,b=Ie,U=Re,X=Oe,ye=qe,B=xe,v=Ae,_e=Me,Ce=Ge,F=Ee,I=Ke,Te=Ye,ze=Pe,ke=Qe,R=He,Ve=Je,we=Xe;return d(),k("div",na,[l(m),l(we,{class:"general-card",title:e.$t("menu.game.config")},{default:t(()=>[l(U,{direction:"vertical",align:"start"},{default:t(()=>[l(g,{label:e.$t("config.search.type.label")},{default:t(()=>[(d(!0),k(w,null,$(S.value,a=>(d(),y(J,{key:a,type:"button","model-value":i.value.type,onChange:ie},{default:t(()=>[l(H,{value:a},{default:t(()=>[s(u(z(a,!1)),1)]),_:2},1032,["value"])]),_:2},1032,["model-value"]))),128))]),_:1},8,["label"]),l(g,{label:e.$t("config.search.subType.label")},{default:t(()=>[(d(!0),k(w,null,$(x.value,a=>(d(),y(J,{key:a,type:"button","model-value":i.value.subType,onChange:ue},{default:t(()=>[l(H,{value:a},{default:t(()=>[s(u(z(a,!0)),1)]),_:2},1032,["value"])]),_:2},1032,["model-value"]))),128))]),_:1},8,["label"]),l(g,{"hide-label":!0},{default:t(()=>[l(ye,{wrap:!1},{default:t(()=>[l(X,{span:15,offset:0},{default:t(()=>[l(U,null,{default:t(()=>[l(N,{modelValue:i.value.filter,"onUpdate:modelValue":n[0]||(n[0]=a=>i.value.filter=a),placeholder:e.$t("config.placeholder.filter")},null,8,["modelValue","placeholder"]),l(b,{type:"primary",onClick:oe},{default:t(()=>[s(u(e.$t("button.search")),1)]),_:1}),l(b,{onClick:ne},{default:t(()=>[s(u(e.$t("button.reset")),1)]),_:1}),l(b,{type:"primary",status:"success",disabled:T.value.length>0,onClick:se},{default:t(()=>[s(u(e.$t("button.add")),1)]),_:1},8,["disabled"]),l(b,{type:"primary",status:"danger",disabled:T.value.length===0,onClick:ce},{default:t(()=>[s(u(e.$t("button.delete")),1)]),_:1},8,["disabled"])]),_:1})]),_:1}),l(X,{span:6,offset:3},{default:t(()=>[l(U,null,{default:t(()=>[l(b,{type:"primary",onClick:ge},{default:t(()=>[s(u(e.$t("config.extra.import")),1)]),_:1}),l(b,{type:"primary",onClick:ve},{default:t(()=>[s(u(e.$t("config.extra.export")),1)]),_:1})]),_:1})]),_:1})]),_:1})]),_:1})]),_:1}),l(_e,{selectedKeys:T.value,"onUpdate:selectedKeys":n[1]||(n[1]=a=>T.value=a),"row-key":"id",loading:Le(W),data:M.value,"column-resizable":"",pagination:!1,bordered:{cell:!0},"row-selection":{type:"checkbox",showCheckedAll:!0,onlyCurrent:!1}},{columns:t(()=>[l(v,{title:e.$t("config.column.type"),"data-index":"configType",width:100,align:"center"},{cell:t(({record:a})=>[l(B,{color:"orangered"},{default:t(()=>[s(u(z(a.configType,!1)),1)]),_:2},1024)]),_:1},8,["title"]),l(v,{title:e.$t("config.column.subType"),"data-index":"configSubType",width:100,align:"center"},{cell:t(({record:a})=>[l(B,{color:"purple"},{default:t(()=>[s(u(z(a.configSubType,!0)),1)]),_:2},1024)]),_:1},8,["title"]),l(v,{title:e.$t("config.column.clazz"),"data-index":"configClazz",width:100,align:"center"},{cell:t(({record:a})=>[l(B,{color:"green"},{default:t(()=>[s(u(P(a.configClazz)),1)]),_:2},1024)]),_:1},8,["title"]),l(v,{title:e.$t("config.column.code"),"data-index":"configCode",width:100,align:"center"},null,8,["title"]),l(v,{title:e.$t("config.column.value"),"data-index":"configValue",width:100,align:"center"},null,8,["title"]),l(v,{title:e.$t("config.column.desc"),"data-index":"configDesc",width:200,align:"center"},null,8,["title"]),l(v,{title:e.$t("config.column.operate"),width:100,align:"center"},{cell:t(({record:a})=>[l(b,{type:"text",size:"mini",onClick:sa=>de(a)},{default:t(()=>[s(u(e.$t("button.edit")),1)]),_:2},1032,["onClick"])]),_:1},8,["title"])]),_:1},8,["selectedKeys","loading","data"]),l(Ce,{style:{"margin-top":"20px"},total:G.value,"page-size":i.value.pageSize,current:i.value.pageNo,"show-total":"","show-jumper":"","show-page-size":"","page-size-options":[10,20,40,80,100],onChange:le,onPageSizeChange:te},null,8,["total","page-size","current"]),l(R,{visible:V.value,"onUpdate:visible":n[9]||(n[9]=a=>V.value=a),width:450,title:j.value,draggable:"","ok-text":e.$t("button.submit"),onOk:re},{default:t(()=>[l(ke,{model:o,"auto-label-width":!0},{default:t(()=>[l(g,{field:"configType",label:e.$t("config.column.type"),required:!0,disabled:o.id!=null&&o.id!=0},{default:t(()=>[l(I,{modelValue:o.configType,"onUpdate:modelValue":n[2]||(n[2]=a=>o.configType=a)},{default:t(()=>[(d(!0),k(w,null,$(q.value,a=>(d(),y(F,{key:a,value:a},{default:t(()=>[s(u(z(a,!1)),1)]),_:2},1032,["value"]))),128))]),_:1},8,["modelValue"])]),_:1},8,["label","disabled"]),l(g,{field:"configSubType",label:e.$t("config.column.subType"),required:!0,disabled:o.id!=null&&o.id!=0},{default:t(()=>[l(I,{modelValue:o.configSubType,"onUpdate:modelValue":n[3]||(n[3]=a=>o.configSubType=a)},{default:t(()=>[(d(!0),k(w,null,$(A.value,a=>(d(),y(F,{key:a,value:a},{default:t(()=>[s(u(z(a,!0)),1)]),_:2},1032,["value"]))),128))]),_:1},8,["modelValue"])]),_:1},8,["label","disabled"]),l(g,{field:"configClazz",label:e.$t("config.column.clazz"),required:!0,disabled:o.id!=null&&o.id!=0},{default:t(()=>[l(I,{modelValue:o.configClazz,"onUpdate:modelValue":n[4]||(n[4]=a=>o.configClazz=a)},{default:t(()=>[(d(!0),k(w,null,$(o.id!=null&&o.id!=0?ee.value:E.value,a=>(d(),y(F,{key:a,value:a},{default:t(()=>[s(u(P(a)),1)]),_:2},1032,["value"]))),128))]),_:1},8,["modelValue"])]),_:1},8,["label","disabled"]),l(g,{field:"configCode",label:e.$t("config.column.code"),required:!0,disabled:o.id!=null&&o.id!=0},{default:t(()=>[l(N,{modelValue:o.configCode,"onUpdate:modelValue":n[5]||(n[5]=a=>o.configCode=a),"max-length":64},null,8,["modelValue"])]),_:1},8,["label","disabled"]),l(g,{field:"configValue",label:e.$t("config.column.value"),required:!0},{default:t(()=>[L(o.configClazz)!=="bool"?(d(),y(N,{key:0,modelValue:o.configValue,"onUpdate:modelValue":n[6]||(n[6]=a=>o.configValue=a),"max-length":256},null,8,["modelValue"])):Z("",!0),L(o.configClazz)==="bool"?(d(),y(Te,{key:1,modelValue:o.configValue,"onUpdate:modelValue":n[7]||(n[7]=a=>o.configValue=a),"checked-value":"true","unchecked-value":"false"},null,8,["modelValue"])):Z("",!0)]),_:1},8,["label"]),l(g,{field:"configDesc",label:e.$t("config.column.desc")},{default:t(()=>[l(ze,{modelValue:o.configDesc,"onUpdate:modelValue":n[8]||(n[8]=a=>o.configDesc=a),"max-length":500},null,8,["modelValue"])]),_:1},8,["label"])]),_:1},8,["model"])]),_:1},8,["visible","title","ok-text"]),l(R,{visible:D.value,"onUpdate:visible":n[10]||(n[10]=a=>D.value=a),width:450,draggable:"",onOk:fe},{title:t(()=>[s(u(e.$t("button.delete")),1)]),default:t(()=>[O("div",null,u(e.$t("config.confirm.text")),1)]),_:1},8,["visible"]),l(R,{visible:h.value,"onUpdate:visible":n[11]||(n[11]=a=>h.value=a),width:450,draggable:"","ok-text":e.$t("button.upload"),onOk:pe},{title:t(()=>[s(u(e.$t("config.extra.import")),1)]),default:t(()=>[O("div",null,[O("p",ia,u(e.$t("config.extra.import.warn")),1)]),l(Ve,{ref_key:"uploadRef",ref:K,"auto-upload":!1,limit:1,action:"/config/v1/importYml","custom-request":me,"file-list":Y.value,onSuccess:be},null,8,["file-list"])]),_:1},8,["visible","ok-text"])]),_:1},8,["title"])])}}});export{za as default};