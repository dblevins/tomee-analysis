_MF_SINGLTN(_PFX_UTIL+"_Dom",Object,{TABLE_ELEMS:{"thead":1,"tbody":1,"tr":1,"th":1,"td":1,"tfoot":1},_Lang:myfaces._impl._util._Lang,_RT:myfaces._impl.core._Runtime,_dummyPlaceHolder:null,constructor_:function(){},runCss:function(G){var B="undefined",H=this._RT,E=this._Lang,F=function(J,I){var K=document.createElement("style");K.setAttribute("rel",J.getAttribute("rel")||"stylesheet");K.setAttribute("type",J.getAttribute("type")||"text/css");document.getElementsByTagName("head")[0].appendChild(K);if(window.attachEvent&&!H.isOpera&&B!=typeof K.styleSheet&&B!=K.styleSheet.cssText){K.styleSheet.cssText=I;}else{K.appendChild(document.createTextNode(I));}},D=function(L){var O=E.equalsIgnoreCase;var K=L.tagName;if(K&&O(K,"link")&&O(L.getAttribute("type"),"text/css")){F(L,"@import url('"+L.getAttribute("href")+"');");}else{if(K&&O(K,"style")&&O(L.getAttribute("type"),"text/css")){var M=[];var N=L.childNodes;if(N){var I=N.length;for(var J=0;J<I;J++){M.push(N[J].innerHTML||N[J].data);}}else{if(L.innerHTML){M.push(L.innerHTML);}}F(L,M.join(""));}}};try{var A=this.findByTagNames(G,{"link":1,"style":1},true);if(A==null){return ;}for(var C=0;C<A.length;C++){D(A[C]);}}finally{D=null;F=null;}},runScripts:function(J,A){var D=this._Lang,F=this._RT,G=[],B=function(N){var K=N.tagName;var L=N.type||"";if(K&&D.equalsIgnoreCase(K,"script")&&(L===""||D.equalsIgnoreCase(L,"text/javascript")||D.equalsIgnoreCase(L,"javascript")||D.equalsIgnoreCase(L,"text/ecmascript")||D.equalsIgnoreCase(L,"ecmascript"))){var O=N.getAttribute("src");if("undefined"!=typeof O&&null!=O&&O.length>0){if((O.indexOf("ln=scripts")==-1&&O.indexOf("ln=javax.faces")==-1)||(O.indexOf("/jsf.js")==-1&&O.indexOf("/jsf-uncompressed.js")==-1)){if(G.length){F.globalEval(G.join("\n"));G=[];}F.loadScriptEval(O,N.getAttribute("type"),false,"UTF-8",false);}}else{var P=(!A)?N.text:D.serializeChilds(N);var M=true;while(M){M=false;if(P.substring(0,1)==" "){P=P.substring(1);M=true;}if(P.substring(0,4)=="<!--"){P=P.substring(4);M=true;}if(P.substring(0,11)=="//<![CDATA["){P=P.substring(11);M=true;}}G.push(P);}}};try{var E=this.findByTagName(J,"script",true);if(E==null){return ;}for(var C=0;C<E.length;C++){B(E[C]);}if(G.length){F.globalEval(G.join("\n"));}}catch(H){if(jsf.getProjectStage()==="Development"){var I=myfaces._impl.core._Runtime.getGlobalConfig("defaultErrorOutput",alert);I("Error in evaluated javascript:"+(H.message||H.description||H));}}finally{B=null;}},byIdOrName:function(C){if(!C){return null;}if(!this._Lang.isString(C)){return C;}var B=this.byId(C);if(B){return B;}var A=document.getElementsByName(C);return((A.length==1)?A[0]:null);},nodeIdOrName:function(B){if(B){B=this.byId(B);if(!B){return null;}var A=B.id||B.name;if((B.id==null||B.id=="")&&B.name){A=B.name;if(document.getElementsByName(A).length>1){return null;}}return A;}return null;},deleteItems:function(A){if(!A||!A.length){return ;}for(var B=0;B<A.length;B++){this.deleteItem(A[B]);}},deleteItem:function(B){var A=this.byId(B);if(!A){throw this._Lang.makeException(new Error(),null,null,this._nameSpace,"deleteItem","_Dom.deleteItem  Unknown Html-Component-ID: "+B);}this._removeNode(A,false);},createElement:function(D,B){var A=document.createElement(D);if(B){for(var C in B){if(!B.hasOwnProperty(C)){continue;}this.setAttribute(A,C,B[C]);}}return A;},isDomCompliant:function(){return true;},insertBefore:function(F,C){this._assertStdParams(F,C,"insertBefore");C=this._Lang.trim(C);if(C===""){return null;}var G=this._buildEvalNodes(F,C),B=F,A=F.parentNode,D=[];for(var E=G.length-1;E>=0;E--){B=A.insertBefore(G[E],B);D.push(B);}D=D.reverse();this._eval(D);return D;},insertAfter:function(F,C){this._assertStdParams(F,C,"insertAfter");C=this._Lang.trim(C);if(C===""){return null;}var G=this._buildEvalNodes(F,C),B=F,A=F.parentNode,D=[];for(var E=0;E<G.length;E++){if(B.nextSibling){B=A.insertBefore(G[E],B.nextSibling);}else{B=A.appendChild(G[E]);}D.push(B);}this._eval(D);return D;},propertyToAttribute:function(A){if(A==="className"){return"class";}else{if(A==="xmllang"){return"xml:lang";}else{return A.toLowerCase();}}},isFunctionNative:function(A){return/^\s*function[^{]+{\s*\[native code\]\s*}\s*$/.test(String(A));},detectAttributes:function(D){if(D.hasAttribute&&this.isFunctionNative(D.hasAttribute)){return function(E){return D.hasAttribute(E);};}else{try{D.getAttribute;var C=D.outerHTML;var B=C.match(/^<[^>]*>/)[0];return function(E){return B.indexOf(E+"=")>-1;};}catch(A){return function(E){return D.getAttribute(E);};}}},cloneAttributes:function(f,T){var e=["className","title","lang","xmllang"];var Q=["name","value","size","maxLength","src","alt","useMap","tabIndex","accessKey","accept","type"];var D=["checked","disabled","readOnly"];var L=["onclick","ondblclick","onmousedown","onmousemove","onmouseout","onmouseover","onmouseup","onkeydown","onkeypress","onkeyup","onhelp","onblur","onfocus","onchange","onload","onunload","onabort","onreset","onselect","onsubmit"];var J=this.detectAttributes(T);var d=this.detectAttributes(f);var F=f.nodeName.toLowerCase()==="input";var W=F?e.concat(Q):e;var I=!T.ownerDocument.contentType||T.ownerDocument.contentType=="text/xml";for(var K=0,c=W.length;K<c;K++){var O=W[K];var S=this.propertyToAttribute(O);if(J(S)){if(S=="class"){if(this._RT.browser.isIE&&(T.getAttribute(O)===T[O])){S=O;}}var M=I?T.getAttribute(S):T[O];var R=f[O];if(R!=M){f[O]=M;}}else{f.removeAttribute(S);if(S=="value"){f[O]="";}}}var B=F?D:[];for(var N=0,a=B.length;N<a;N++){var G=B[N];var A=T[G];var V=f[G];if(V!=A){f[G]=A;}}if(J("style")){var P;var U;if(this._RT.browser.isIE){P=T.style.cssText;U=f.style.cssText;if(P!=U){f.style.cssText=P;}}else{P=T.getAttribute("style");U=f.getAttribute("style");if(P!=U){f.setAttribute("style",P);}}}else{if(d("style")){f.removeAttribute("style");}}if(!this._RT.browser.isIE&&T.dir!=f.dir){if(J("dir")){f.dir=T.dir;}else{if(d("dir")){f.dir="";}}}for(var Z=0,H=L.length;Z<H;Z++){var g=L[Z];f[g]=T[g]?T[g]:null;if(T[g]){T[g]=null;}}try{var Y=f.dataset;var C=T.dataset;if(Y||C){for(var E in Y){delete Y[E];}for(var X in C){Y[X]=C[X];}}}catch(b){}},getCaretPosition:function(C){var A=0;try{if(C.selectionStart||C.selectionStart=="0"){A=C.selectionStart;}else{if(document.selection){C.focus();var B=document.selection.createRange();B.moveStart("character",-C.value.length);A=B.text.length;}}}catch(D){}return A;},setCaretPosition:function(B,C){if(B.createTextRange){var A=B.createTextRange();A.collapse(true);A.moveEnd("character",C);A.moveStart("character",C);A.select();}else{if(B.setSelectionRange){B.focus();B.setSelectionRange(C,C);}}},outerHTML:function(E,B,A){this._assertStdParams(E,B,"outerHTML");B=this._Lang.trim(B);if(E.nodeName.toLowerCase()==="input"){var G=this._buildEvalNodes(E,B)[0];this.cloneAttributes(E,G);return E;}else{if(B!==""){var C=null;var H=null;var F=0;if(A&&"undefined"!=typeof document.activeElement){H=(document.activeElement)?document.activeElement.id:null;F=this.getCaretPosition(document.activeElement);}if(this.isDomCompliant()){C=this._outerHTMLCompliant(E,B);}else{C=this._outerHTMLNonCompliant(E,B);}if(H){var D=this.byId(H);if(D&&D.nodeName.toLowerCase()==="input"){if("undefined"!=typeof D.focus){D.focus();}}if(D&&F){this.setCaretPosition(D,F);}}this._eval(C);return C;}this._removeNode(E,false);return null;}},detach:function(A){var B=[];if("undefined"!=typeof A.nodeType){if(A.parentNode){B.push(A.parentNode.removeChild(A));}else{B.push(A);}return B;}var D=this._Lang.objToArray(A);for(var C=0;C<D.length;C++){B.push(D[C].parentNode.removeChild(D[C]));}return B;},_outerHTMLCompliant:function(C,A){var D=this._buildEvalNodes(C,A);if(D.length==1){var B=D[0];C.parentNode.replaceChild(B,C);return B;}else{return this.replaceElements(C,D);}},_isTableElement:function(A){return !!this.TABLE_ELEMS[(A.nodeName||A.tagName).toLowerCase()];},_buildNodesCompliant:function(A){var B=this.getDummyPlaceHolder();B.innerHTML=A;return this._Lang.objToArray(B.childNodes);},_buildTableNodes:function(F,B){var A=(F.nodeName||F.tagName).toLowerCase();var C=A;var G=0;while(C!="table"){F=F.parentNode;C=(F.nodeName||F.tagName).toLowerCase();G++;}var E=this.getDummyPlaceHolder();if(A=="td"){E.innerHTML="<table><tbody><tr>"+B+"</tr></tbody></table>";}else{E.innerHTML="<table>"+B+"</table>";}for(var D=0;D<G;D++){E=E.childNodes[0];}return this.detach(E.childNodes);},_removeChildNodes:function(A){if(!A){return ;}A.innerHTML="";},_removeNode:function(B){if(!B){return ;}var A=B.parentNode;if(A){A.removeChild(B);}},_buildEvalNodes:function(C,A){var D=null;if(this._isTableElement(C)){D=this._buildTableNodes(C,A);}else{var B=(!this._RT.browser.isIE||this._RT.browser.isIE>8);D=(this.isDomCompliant()&&B)?this._buildNodesCompliant(A):this._buildNodesNonCompliant(A);}return D;},_assertStdParams:function(F,B,C,H){if(!C){throw this._Lang.makeException(new Error(),null,null,this._nameSpace,"_assertStdParams","Caller must be set for assertion");}var D=this._Lang,A="ERR_MUST_BE_PROVIDED1",E="myfaces._impl._util._Dom.",G=H||["item","markup"];if(!F||!B){D.makeException(new Error(),null,null,E,""+C,D.getMessage(A,null,E+"."+C,(!F)?G[0]:G[1]));}},_eval:function(C){if(this.isManualScriptEval()){var B=C instanceof Array;if(B&&C.length){for(var A=0;A<C.length;A++){this.runScripts(C[A]);}}else{if(!B){this.runScripts(C);}}}},replaceElement:function(B,A){B.parentNode.insertBefore(A,B);this._removeNode(B,false);},replaceElements:function(F,G){var C=G&&"undefined"!=typeof G.length;if(!C){throw this._Lang.makeException(new Error(),null,null,this._nameSpace,"replaceElements",this._Lang.getMessage("ERR_REPLACE_EL"));}var A=F.parentNode,D=F.nextSibling,E=this._Lang.objToArray(G);for(var B=0;B<E.length;B++){if(B==0){this.replaceElement(F,E[B]);}else{if(D){A.insertBefore(E[B],D);}else{A.appendChild(E[B]);}}}return E;},findByTagNames:function(C,A){this._assertStdParams(C,A,"findByTagNames",["fragment","tagNames"]);var B=C.nodeType;if(B!=1&&B!=9&&B!=11){return null;}if(C.querySelectorAll){var G=[];for(var E in A){if(!A.hasOwnProperty(E)){continue;}G.push(E);}var D=[];if(C.tagName&&A[C.tagName.toLowerCase()]){D.push(C);}return D.concat(this._Lang.objToArray(C.querySelectorAll(G.join(", "))));}var F=function(H){return H.tagName&&A[H.tagName.toLowerCase()];};try{return this.findAll(C,F,true);}finally{F=null;}},findByTagName:function(C,E){this._assertStdParams(C,E,"findByTagName",["fragment","tagName"]);var D=this._Lang,A=C.nodeType;if(A!=1&&A!=9&&A!=11){return null;}var B=D.objToArray(C.getElementsByTagName(E));if(C.tagName&&D.equalsIgnoreCase(C.tagName,E)){B.unshift(C);}return B;},findByName:function(D,C){this._assertStdParams(D,C,"findByName",["fragment","name"]);var A=D.nodeType;if(A!=1&&A!=9&&A!=11){return null;}var B=this._Lang.objToArray(D.getElementsByName(C));if(D.name==C){B.unshift(D);}return B;},findAll:function(A,B,C){this._Lang.assertType(B,"function");C=!!C;if(document.createTreeWalker&&NodeFilter){return this._iteratorSearchAll(A,B,C);}else{return this._recursionSearchAll(A,B,C);}},_iteratorSearchAll:function(D,B,E){var C=[];if(B(D)){C.push(D);if(!E){return C;}}var A=NodeFilter.FILTER_ACCEPT,F=NodeFilter.FILTER_SKIP,H=NodeFilter.FILTER_REJECT;var G=function(J){var K=(B(J))?A:F;K=(!E&&K==A)?H:K;if(K==A||K==H){C.push(J);}return K;};var I=document.createTreeWalker(D,NodeFilter.SHOW_ELEMENT,G,false);while(I.nextNode()){}return C;},setAttribute:function(B,A,C){this._assertStdParams(B,A,"setAttribute",["fragment","name"]);if(!B.setAttribute){return ;}if(A==="disabled"){B.disabled=C==="disabled"||C==="true";}else{if(A==="checked"){B.checked=C==="checked"||C==="on"||C==="true";}else{if(A=="readonly"){B.readOnly=C==="readonly"||C==="true";}else{B.setAttribute(A,C);}}}},fuzzyFormDetection:function(F){var A=document.forms,G=this._Lang;if(!A||!A.length){return null;}else{if(1==A.length&&this._RT.getGlobalConfig("no_portlet_env",false)){return A[0];}}var K=this.byId(F);var J=G.hitch(this,function(L){return(G.equalsIgnoreCase(L.tagName,"form"))?L:(this.html5FormDetection(L)||this.getParent(L,"form"));});if(K){var I=J(K);if(I){return I;}}var D=[];var B=(G.isString(F))?F:F.name;if(!B){return null;}var C=document.getElementsByName(B);if(C){for(var E=0;E<C.length&&D.length<2;E++){var H=J(C[E]);if(H){D.push(H);}}}return(1==D.length)?D[0]:null;},html5FormDetection:function(){return null;},getParent:function(D,C){if(!D){throw this._Lang.makeException(new Error(),null,null,this._nameSpace,"getParent",this._Lang.getMessage("ERR_MUST_BE_PROVIDED1",null,"_Dom.getParent","item {DomNode}"));}var B=this._Lang;var A=function(E){return E&&E.tagName&&B.equalsIgnoreCase(E.tagName,C);};try{return this.getFilteredParent(D,A);}finally{A=null;B=null;}},getFilteredParent:function(C,B){this._assertStdParams(C,B,"getFilteredParent",["item","filter"]);var A=(C.parentNode)?C.parentNode:null;while(A&&!B(A)){A=A.parentNode;}return(A)?A:null;},getAttribute:function(B,A){return B.getAttribute(A);},hasAttribute:function(B,A){return this.getAttribute(B,A)?true:false;},concatCDATABlocks:function(C){var A=[];for(var B=0;B<C.childNodes.length;B++){A.push(C.childNodes[B].data);}return A.join("");},isManualScriptEval:function(){return true;},isMultipartCandidate:function(B){if(this._Lang.isString(B)){B=this._Lang.strToArray(B,/\s+/);}for(var F=0,A=B.length;F<A;F++){var E=this.byId(B[F]);var C=this.findByTagName(E,"input",true);for(var G=0,D=C.length;G<D;G++){if(this.getAttribute(C[G],"type")=="file"){return true;}}}return false;},insertFirst:function(B){var A=document.body;if(A.childNodes.length>0){A.insertBefore(B,A.firstChild);}else{A.appendChild(B);}},byId:function(A){return this._Lang.byId(A);},getDummyPlaceHolder:function(){this._dummyPlaceHolder=this._dummyPlaceHolder||this.createElement("div");return this._dummyPlaceHolder;},getNamedElementFromForm:function(B,A){return B[A];}});