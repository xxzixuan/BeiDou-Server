import{d as y,j as R,r as U,C as $,D as I,G as n,aR as t,aM as o,aL as s,u as w,aQ as m,aY as E,b5 as M,b6 as N,b7 as j,b8 as D,aJ as Q,aZ as T,b9 as z,ba as G}from"./arco.87c3ce50.js";import{F as J}from"./index.e76c93e0.js";import{u as W,v as Y,I as Z,a as A,_ as k}from"./index.53c86f70.js";import{u as H}from"./loading.7b660b93.js";/* empty css              *//* empty css               *//* empty css               */import{f as K,g as O}from"./vue.5b803e24.js";import"./chart.7bbcdda7.js";const X={class:"login-form-wrapper"},ee={class:"login-form-title"},oe={class:"login-form-sub-title"},se={class:"login-form-error-msg"},ae={class:"login-form-password-actions"},re=y({__name:"login-form",setup(x){const u=K(),c=R(""),{loading:v,setLoading:b}=H(),F=W(),{t:P}=Y.exports.useI18n(),a=O("login-config",{rememberPassword:!0,username:"admin",password:"admin"}),i=U({username:a.value.username,password:a.value.password}),V=async({errors:e,values:r})=>{if(!v.value&&!e){b(!0);try{await F.login(r);const{redirect:l,..._}=u.currentRoute.value.query;u.push({name:l||"Workplace",query:{..._}}),E.success(P("message.login.success"));const{rememberPassword:d}=a.value,{username:p,password:g}=r;a.value.username=d?p:"",a.value.password=d?g:""}catch(l){c.value=l.message,l.name==="TypeError"&&(c.value="\u9519\u8BEF\u7684\u8BF7\u6C42")}finally{b(!1)}}},C=e=>{a.value.rememberPassword=e};return(e,r)=>{const l=Z,_=M,d=N,p=A,g=j,S=D,B=Q,h=T,L=z,q=G;return $(),I("div",X,[n("div",ee,t(e.$t("title")),1),n("div",oe,t(e.$t("form.login.title")),1),n("div",se,t(c.value),1),o(q,{ref:"loginForm",model:i,class:"login-form",layout:"vertical",onSubmit:V},{default:s(()=>[o(d,{field:"username",rules:[{required:!0,message:e.$t("form.login.user.empty")}],"validate-trigger":["change","blur"],"hide-label":""},{default:s(()=>[o(_,{modelValue:i.username,"onUpdate:modelValue":r[0]||(r[0]=f=>i.username=f),placeholder:e.$t("form.login.user.placeholder")},{prefix:s(()=>[o(l)]),_:1},8,["modelValue","placeholder"])]),_:1},8,["rules"]),o(d,{field:"password",rules:[{required:!0,message:e.$t("form.login.password.empty")}],"validate-trigger":["change","blur"],"hide-label":""},{default:s(()=>[o(g,{modelValue:i.password,"onUpdate:modelValue":r[1]||(r[1]=f=>i.password=f),placeholder:e.$t("form.login.password.placeholder"),"allow-clear":""},{prefix:s(()=>[o(p)]),_:1},8,["modelValue","placeholder"])]),_:1},8,["rules"]),o(L,{size:16,direction:"vertical"},{default:s(()=>[n("div",ae,[o(S,{checked:"rememberPassword","model-value":w(a).rememberPassword,onChange:C},{default:s(()=>[m(t(e.$t("form.login.rememberPassword")),1)]),_:1},8,["model-value","onChange"]),o(B,null,{default:s(()=>[m(t(e.$t("form.login.forgetPassword")),1)]),_:1})]),o(h,{type:"primary","html-type":"submit",long:"",loading:w(v)},{default:s(()=>[m(t(e.$t("form.login.login")),1)]),_:1},8,["loading"]),o(h,{type:"text",long:"",class:"login-form-register-btn"},{default:s(()=>[m(t(e.$t("form.login.register")),1)]),_:1})]),_:1})]),_:1},8,["model"])])}}});const te=k(re,[["__scopeId","data-v-9713a53a"]]),ne={class:"container"},le={class:"content"},ie={class:"content-inner"},de={class:"footer"},ce=y({__name:"index",setup(x){return(u,c)=>($(),I("div",ne,[n("div",le,[n("div",ie,[o(te)]),n("div",de,[o(J)])])]))}});const we=k(ce,[["__scopeId","data-v-dc4b5e84"]]);export{we as default};
