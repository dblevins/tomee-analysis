package asm.com.sun.faces.application;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class ApplicationAssociateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/ApplicationAssociate", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "com/sun/faces/application/ApplicationAssociate", "PostConstructApplicationListener", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/application/ApplicationAssociate$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "com/sun/faces/config/WebConfiguration", "BooleanWebContextInitParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "com/sun/faces/el/FacesCompositeELResolver", "ELResolverChainType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$WebContextInitParameter", "com/sun/faces/config/WebConfiguration", "WebContextInitParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "navigationMap", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Ljavax/faces/application/NavigationCase;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "facesComponentsByNamespace", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/sun/faces/application/annotation/FacesComponentUsage;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "responseRendered", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ASSOCIATE_KEY", "Ljava/lang/String;", null, "com.sun.faces.ApplicationAssociate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "instance", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lcom/sun/faces/application/ApplicationAssociate;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "elResolversFromFacesConfig", "Ljava/util/List;", "Ljava/util/List<Ljavax/el/ELResolver;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "legacyVRChainHead", "Ljavax/faces/el/VariableResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "legacyVRChainHeadWrapperForJsp", "Lcom/sun/faces/el/VariableResolverChainWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "legacyVRChainHeadWrapperForFaces", "Lcom/sun/faces/el/VariableResolverChainWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "legacyPRChainHead", "Ljavax/faces/el/PropertyResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expressionFactory", "Ljavax/el/ExpressionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "legacyPropertyResolver", "Ljavax/faces/el/PropertyResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "legacyVariableResolver", "Ljavax/faces/el/VariableResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "facesELResolverForJsp", "Lcom/sun/faces/el/FacesCompositeELResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "injectionProvider", "Lcom/sun/faces/spi/InjectionProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resourceCache", "Lcom/sun/faces/application/resource/ResourceCache;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contextName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requestServiced", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "errorPagePresent", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "beanManager", "Lcom/sun/faces/mgbean/BeanManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotationManager", "Lcom/sun/faces/application/annotation/AnnotationManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "devModeEnabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hasPushBuilder", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "compiler", "Lcom/sun/faces/facelets/compiler/Compiler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "faceletFactory", "Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resourceManager", "Lcom/sun/faces/application/resource/ResourceManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "applicationStateInfo", "Lcom/sun/faces/application/ApplicationStateInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "propertyEditorHelper", "Lcom/sun/faces/application/PropertyEditorHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "namedEventManager", "Lcom/sun/faces/application/NamedEventManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "webConfig", "Lcom/sun/faces/config/WebConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "flowHandler", "Ljavax/faces/flow/FlowHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "searchExpressionHandler", "Ljavax/faces/component/search/SearchExpressionHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "definingDocumentIdsToTruncatedJarUrls", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "timeOfInstantiation", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resourceLibraryContracts", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "resourceBundles", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lcom/sun/faces/application/ApplicationResourceBundle;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/application/ApplicationImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/PropertyEditorHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/PropertyEditorHelper", "<init>", "(Ljavax/faces/application/Application;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "propertyEditorHelper", "Lcom/sun/faces/application/PropertyEditorHelper;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ApplicationAssociate ctor not called in same callstack as ConfigureListener.contextInitialized()");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/faces/application/ApplicationAssociate", "com/sun/faces/application/ApplicationImpl", "javax/faces/context/FacesContext"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getExternalContext", "()Ljavax/faces/context/ExternalContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("com.sun.faces.APPLICATION_ASSOCIATE_EXISTS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageUtils", "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/context/ExternalContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "navigationMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/ConfigManager", "INJECTION_PROVIDER_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/spi/InjectionProvider");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "injectionProvider", "Lcom/sun/faces/spi/InjectionProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/WebConfiguration", "getInstance", "(Ljavax/faces/context/ExternalContext;)Lcom/sun/faces/config/WebConfiguration;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "webConfig", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/BeanManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "injectionProvider", "Lcom/sun/faces/spi/InjectionProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "webConfig", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableLazyBeanValidation", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isOptionEnabled", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanManager", "<init>", "(Lcom/sun/faces/spi/InjectionProvider;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "beanManager", "Lcom/sun/faces/mgbean/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/event/PreDestroyCustomScopeEvent;"));
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/event/ScopeContext;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "beanManager", "Lcom/sun/faces/mgbean/BeanManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "subscribeToEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "annotationManager", "Lcom/sun/faces/application/annotation/AnnotationManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getProjectStage", "()Ljavax/faces/application/ProjectStage;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/application/ProjectStage", "Development", "Ljavax/faces/application/ProjectStage;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/faces/application/ApplicationAssociate", "com/sun/faces/application/ApplicationImpl", "javax/faces/context/FacesContext", "javax/faces/context/ExternalContext", "java/util/Map"}, 1, new Object[] {"com/sun/faces/application/ApplicationAssociate"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/faces/application/ApplicationAssociate", "com/sun/faces/application/ApplicationImpl", "javax/faces/context/FacesContext", "javax/faces/context/ExternalContext", "java/util/Map"}, 2, new Object[] {"com/sun/faces/application/ApplicationAssociate", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "devModeEnabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ApplicationAssociate", "checkForPushBuilder", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "hasPushBuilder", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "devModeEnabled", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/resource/ResourceCache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/resource/ResourceCache", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceCache", "Lcom/sun/faces/application/resource/ResourceCache;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/resource/ResourceManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceCache", "Lcom/sun/faces/application/resource/ResourceCache;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/resource/ResourceManager", "<init>", "(Ljava/util/Map;Lcom/sun/faces/application/resource/ResourceCache;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceManager", "Lcom/sun/faces/application/resource/ResourceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/NamedEventManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/NamedEventManager", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "namedEventManager", "Lcom/sun/faces/application/NamedEventManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ApplicationStateInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ApplicationStateInfo", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationStateInfo", "Lcom/sun/faces/application/ApplicationStateInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/event/PostConstructApplicationEvent;"));
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/application/Application;"));
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;Lcom/sun/faces/application/ApplicationAssociate$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "subscribeToEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "definingDocumentIdsToTruncatedJarUrls", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "timeOfInstantiation", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkForPushBuilder", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchMethodException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/SecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/http/HttpServletRequest;"));
methodVisitor.visitLdcInsn("newPushBuilder");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getApplication", "()Ljavax/faces/application/Application;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResourceLibraryContracts", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceLibraryContracts", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initializeFacelets", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "compiler", "Lcom/sun/faces/facelets/compiler/Compiler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "webConfig", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandler", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isOptionEnabled", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "webConfig", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandlerDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isOptionEnabled", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getExternalContext", "()Ljavax/faces/context/ExternalContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "webConfig", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "createCompiler", "(Ljava/util/Map;Lcom/sun/faces/config/WebConfiguration;)Lcom/sun/faces/facelets/compiler/Compiler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "compiler", "Lcom/sun/faces/facelets/compiler/Compiler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "compiler", "Lcom/sun/faces/facelets/compiler/Compiler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "webConfig", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "createFaceletFactory", "(Ljavax/faces/context/FacesContext;Lcom/sun/faces/facelets/compiler/Compiler;Lcom/sun/faces/config/WebConfiguration;)Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "faceletFactory", "Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/context/FacesContext"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljavax/faces/context/ExternalContext;)Lcom/sun/faces/application/ApplicationAssociate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ApplicationAssociate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimeOfInstantiation", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "timeOfInstantiation", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljavax/servlet/ServletContext;)Lcom/sun/faces/application/ApplicationAssociate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/ServletContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ApplicationAssociate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setCurrentInstance", "(Lcom/sun/faces/application/ApplicationAssociate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "instance", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "remove", "()V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "instance", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCurrentInstance", "()Lcom/sun/faces/application/ApplicationAssociate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "instance", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ApplicationAssociate");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getExternalContext", "()Ljavax/faces/context/ExternalContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "getInstance", "(Ljavax/faces/context/ExternalContext;)Lcom/sun/faces/application/ApplicationAssociate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/application/ApplicationAssociate"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getApplicationStateInfo", "()Lcom/sun/faces/application/ApplicationStateInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationStateInfo", "Lcom/sun/faces/application/ApplicationStateInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourceManager", "()Lcom/sun/faces/application/resource/ResourceManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceManager", "Lcom/sun/faces/application/resource/ResourceManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourceLibraryContracts", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceLibraryContracts", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResourceManager", "(Lcom/sun/faces/application/resource/ResourceManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceManager", "Lcom/sun/faces/application/resource/ResourceManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourceCache", "()Lcom/sun/faces/application/resource/ResourceCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceCache", "Lcom/sun/faces/application/resource/ResourceCache;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationManager", "()Lcom/sun/faces/application/annotation/AnnotationManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "annotationManager", "Lcom/sun/faces/application/annotation/AnnotationManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompiler", "()Lcom/sun/faces/facelets/compiler/Compiler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "compiler", "Lcom/sun/faces/facelets/compiler/Compiler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "initializeFacelets", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "compiler", "Lcom/sun/faces/facelets/compiler/Compiler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isErrorPagePresent", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "errorPagePresent", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setErrorPagePresent", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "errorPagePresent", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFaceletFactory", "()Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "faceletFactory", "Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "clearInstance", "(Ljavax/faces/context/ExternalContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ApplicationAssociate");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map", "com/sun/faces/application/ApplicationAssociate"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "clearInstance", "(Ljavax/servlet/ServletContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/ServletContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ApplicationAssociate");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/application/ApplicationAssociate"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("com.sun.faces.ApplicationAssociate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/ServletContext", "removeAttribute", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBeanManager", "()Lcom/sun/faces/mgbean/BeanManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "beanManager", "Lcom/sun/faces/mgbean/BeanManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initializeELResolverChains", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getCompositeELResolver", "()Lcom/sun/faces/el/FacesCompositeELResolver;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/DemuxCompositeELResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "Faces", "Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/DemuxCompositeELResolver", "<init>", "(Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "setCompositeELResolver", "(Lcom/sun/faces/el/FacesCompositeELResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getCompositeELResolver", "()Lcom/sun/faces/el/FacesCompositeELResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/el/ELUtils", "buildFacesResolver", "(Lcom/sun/faces/el/FacesCompositeELResolver;Lcom/sun/faces/application/ApplicationAssociate;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/lifecycle/ELResolverInitPhaseListener", "populateFacesELResolverForJsp", "(Ljavax/faces/application/Application;Lcom/sun/faces/application/ApplicationAssociate;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "installProgrammaticallyAddedResolvers", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "getLegacyVariableResolver", "()Ljavax/faces/el/VariableResolver;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "getLegacyVRChainHeadWrapperForJsp", "()Lcom/sun/faces/el/VariableResolverChainWrapper;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/VariableResolverChainWrapper", "setWrapped", "(Ljavax/faces/el/VariableResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "getLegacyVRChainHeadWrapperForFaces", "()Lcom/sun/faces/el/VariableResolverChainWrapper;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/VariableResolverChainWrapper", "setWrapped", "(Ljavax/faces/el/VariableResolver;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/el/VariableResolver"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDevModeEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "devModeEnabled", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPushBuilderSupported", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "hasPushBuilder", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPropertyEditorHelper", "()Lcom/sun/faces/application/PropertyEditorHelper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "propertyEditorHelper", "Lcom/sun/faces/application/PropertyEditorHelper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLegacyVRChainHead", "(Ljavax/faces/el/VariableResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVRChainHead", "Ljavax/faces/el/VariableResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLegacyVRChainHead", "()Ljavax/faces/el/VariableResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVRChainHead", "Ljavax/faces/el/VariableResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLegacyVRChainHeadWrapperForJsp", "()Lcom/sun/faces/el/VariableResolverChainWrapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVRChainHeadWrapperForJsp", "Lcom/sun/faces/el/VariableResolverChainWrapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLegacyVRChainHeadWrapperForJsp", "(Lcom/sun/faces/el/VariableResolverChainWrapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVRChainHeadWrapperForJsp", "Lcom/sun/faces/el/VariableResolverChainWrapper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLegacyVRChainHeadWrapperForFaces", "()Lcom/sun/faces/el/VariableResolverChainWrapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVRChainHeadWrapperForFaces", "Lcom/sun/faces/el/VariableResolverChainWrapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLegacyVRChainHeadWrapperForFaces", "(Lcom/sun/faces/el/VariableResolverChainWrapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVRChainHeadWrapperForFaces", "Lcom/sun/faces/el/VariableResolverChainWrapper;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLegacyPRChainHead", "(Ljavax/faces/el/PropertyResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyPRChainHead", "Ljavax/faces/el/PropertyResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLegacyPRChainHead", "()Ljavax/faces/el/PropertyResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyPRChainHead", "Ljavax/faces/el/PropertyResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFacesELResolverForJsp", "()Lcom/sun/faces/el/FacesCompositeELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "facesELResolverForJsp", "Lcom/sun/faces/el/FacesCompositeELResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFlowHandler", "()Ljavax/faces/flow/FlowHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "flowHandler", "Ljavax/faces/flow/FlowHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFlowHandler", "(Ljavax/faces/flow/FlowHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "flowHandler", "Ljavax/faces/flow/FlowHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSearchExpressionHandler", "()Ljavax/faces/component/search/SearchExpressionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "searchExpressionHandler", "Ljavax/faces/component/search/SearchExpressionHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSearchExpressionHandler", "(Ljavax/faces/component/search/SearchExpressionHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "searchExpressionHandler", "Ljavax/faces/component/search/SearchExpressionHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFacesELResolverForJsp", "(Lcom/sun/faces/el/FacesCompositeELResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "facesELResolverForJsp", "Lcom/sun/faces/el/FacesCompositeELResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setELResolversFromFacesConfig", "(Ljava/util/List;)V", "(Ljava/util/List<Ljavax/el/ELResolver;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "elResolversFromFacesConfig", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELResolversFromFacesConfig", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/el/ELResolver;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "elResolversFromFacesConfig", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExpressionFactory", "(Ljavax/el/ExpressionFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getApplicationELResolvers", "()Ljavax/el/CompositeELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getApplicationELResolvers", "()Ljavax/el/CompositeELResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectionProvider", "()Lcom/sun/faces/spi/InjectionProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "injectionProvider", "Lcom/sun/faces/spi/InjectionProvider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContextName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "contextName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContextName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "contextName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLegacyPropertyResolver", "(Ljavax/faces/el/PropertyResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyPropertyResolver", "Ljavax/faces/el/PropertyResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLegacyPropertyResolver", "()Ljavax/faces/el/PropertyResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyPropertyResolver", "Ljavax/faces/el/PropertyResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLegacyVariableResolver", "(Ljavax/faces/el/VariableResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVariableResolver", "Ljavax/faces/el/VariableResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLegacyVariableResolver", "()Ljavax/faces/el/VariableResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "legacyVariableResolver", "Ljavax/faces/el/VariableResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequestServiced", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "requestServiced", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasRequestBeenServiced", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "requestServiced", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFacesComponent", "(Lcom/sun/faces/application/annotation/FacesComponentUsage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "facesComponentsByNamespace", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "facesComponentsByNamespace", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "facesComponentsByNamespace", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/annotation/FacesComponentUsage", "getAnnotation", "()Ljavax/faces/component/FacesComponent;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/FacesComponent", "namespace", "()Ljava/lang/String;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "lambda$addFacesComponent$0", "(Ljava/lang/String;)Ljava/util/List;", false), Type.getType("(Ljava/lang/String;)Ljava/util/List;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "computeIfAbsent", "(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getComponentsForNamespace", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List<Lcom/sun/faces/application/annotation/FacesComponentUsage;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "facesComponentsByNamespace", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "facesComponentsByNamespace", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "facesComponentsByNamespace", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNavigationCase", "(Ljavax/faces/application/NavigationCase;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "navigationMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/NavigationCase", "getFromViewId", "()Ljava/lang/String;", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "lambda$addNavigationCase$1", "(Ljava/lang/String;)Ljava/util/Set;", false), Type.getType("(Ljava/lang/String;)Ljava/util/Set;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "computeIfAbsent", "(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamedEventManager", "()Lcom/sun/faces/application/NamedEventManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "namedEventManager", "Lcom/sun/faces/application/NamedEventManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNavigationCaseListMappings", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Ljavax/faces/application/NavigationCase;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "navigationMap", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "navigationMap", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourceBundle", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/ResourceBundle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ApplicationResourceBundle");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/application/ApplicationResourceBundle"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getViewRoot", "()Ljavax/faces/component/UIViewRoot;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIViewRoot", "getLocale", "()Ljava/util/Locale;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Locale", "java/util/Locale", "javax/faces/component/UIViewRoot"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationResourceBundle", "getResourceBundle", "(Ljava/util/Locale;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addResourceBundle", "(Ljava/lang/String;Lcom/sun/faces/application/ApplicationResourceBundle;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourceBundles", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lcom/sun/faces/application/ApplicationResourceBundle;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "resourceBundles", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "responseRendered", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "responseRendered", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isResponseRendered", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "responseRendered", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "urlIsRelatedToDefiningDocumentInJar", "(Ljava/net/URL;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "definingDocumentIdsToTruncatedJarUrls", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("/META-INF");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitTypeInsn(NEW, "javax/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid url for application configuration resources file with respect to faces flows");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/FacesException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"com/sun/faces/application/ApplicationAssociate", "java/net/URL", "java/lang/String", Opcodes.INTEGER, "java/lang/String", "java/lang/String", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "relateUrlToDefiningDocumentInJar", "(Ljava/net/URL;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("/META-INF");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "definingDocumentIdsToTruncatedJarUrls", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createFaceletFactory", "(Ljavax/faces/context/FacesContext;Lcom/sun/faces/facelets/compiler/Compiler;Lcom/sun/faces/config/WebConfiguration;)Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassCastException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/ClassNotFoundException");
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/InstantiationException");
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/IllegalAccessException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getProjectStage", "()Ljavax/faces/application/ProjectStage;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/application/ProjectStage", "Production", "Ljavax/faces/application/ProjectStage;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isSet", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriodDeprecated", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isSet", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "getOptionValue", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLdcInsn("-1");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDefaultRefreshPeriod", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "getDefaultValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "parseLong", "(Ljava/lang/String;)J", false);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/impl/DefaultResourceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "applicationImpl", "Lcom/sun/faces/application/ApplicationImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getResourceHandler", "()Ljavax/faces/application/ResourceHandler;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/impl/DefaultResourceResolver", "<init>", "(Ljavax/faces/application/ResourceHandler;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsResourceResolver", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "getOptionValue", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/view/facelets/ResourceResolver;"));
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/util/ReflectionUtil", "decorateInstance", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/view/facelets/ResourceResolver");
methodVisitor.visitVarInsn(ASTORE, 9);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"com/sun/faces/application/ApplicationAssociate", "javax/faces/context/FacesContext", "com/sun/faces/facelets/compiler/Compiler", "com/sun/faces/config/WebConfiguration", Opcodes.INTEGER, "java/lang/String", Opcodes.LONG, "javax/faces/view/facelets/ResourceResolver", "javax/faces/view/facelets/ResourceResolver", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/ConfigManager", "getAnnotatedClasses", "(Ljavax/faces/context/FacesContext;)Ljava/util/Map;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/view/facelets/FaceletsResourceResolver;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Found more than one class annotated with FaceletsResourceResolver.  Will use {0} and ignore the others");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Set", "java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/view/facelets/ResourceResolver;"));
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/util/ReflectionUtil", "decorateInstance", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/view/facelets/ResourceResolver");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "EnableFaceletsResourceResolverResolveCompositeComponents", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isOptionEnabled", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getExternalContext", "()Ljavax/faces/context/ExternalContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("com.sun.faces.NDRRPN");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletCache", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "getOptionValue", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label14);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/util/ReflectionUtil", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/facelets/FaceletCache");
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "<init>", "(Lcom/sun/faces/facelets/FaceletCache;)V", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"com/sun/faces/application/ApplicationAssociate", "javax/faces/context/FacesContext", "com/sun/faces/facelets/compiler/Compiler", "com/sun/faces/config/WebConfiguration", Opcodes.INTEGER, "java/lang/String", Opcodes.LONG, "javax/faces/view/facelets/ResourceResolver", "javax/faces/view/facelets/ResourceResolver", "java/lang/String", "javax/faces/view/facelets/FaceletCache", "java/lang/String"}, 1, new Object[] {"java/lang/ClassCastException"});
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "INFO", "Ljava/util/logging/Level;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Please remove context-param when using javax.faces.view.facelets.FaceletCache class with name:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("and use the new FaceletCacheFactory API");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ReflectiveOperationException"});
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Error Loading Facelet cache: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label16);
methodVisitor.visitLdcInsn("javax.faces.view.facelets.FaceletCacheFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/FactoryFinder", "getFactory", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/view/facelets/FaceletCacheFactory");
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/FaceletCacheFactory", "getFaceletCache", "()Ljavax/faces/view/facelets/FaceletCache;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/impl/DefaultFaceletFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/impl/DefaultFaceletFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/impl/DefaultFaceletFactory", "init", "(Lcom/sun/faces/facelets/compiler/Compiler;Ljavax/faces/view/facelets/ResourceResolver;JLjavax/faces/view/facelets/FaceletCache;)V", false);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createCompiler", "(Ljava/util/Map;Lcom/sun/faces/config/WebConfiguration;)Lcom/sun/faces/facelets/compiler/Compiler;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lcom/sun/faces/config/WebConfiguration;)Lcom/sun/faces/facelets/compiler/Compiler;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/compiler/SAXCompiler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/compiler/SAXCompiler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "loadDecorators", "(Ljava/util/Map;Lcom/sun/faces/facelets/compiler/Compiler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "FaceletsSkipComments", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isOptionEnabled", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "setTrimmingComments", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "addTagLibraries", "(Lcom/sun/faces/facelets/compiler/Compiler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "loadDecorators", "(Ljava/util/Map;Lcom/sun/faces/facelets/compiler/Compiler;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lcom/sun/faces/facelets/compiler/Compiler;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InstantiationException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalAccessException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "webConfig", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "FaceletsDecorators", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "getOptionValue", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "split", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"com/sun/faces/application/ApplicationAssociate", "java/util/Map", "com/sun/faces/facelets/compiler/Compiler", "java/lang/String", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/util/ReflectionUtil", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/view/facelets/TagDecorator");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagDecorator", "(Ljavax/faces/view/facelets/TagDecorator;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Successfully Loaded Decorator: {0}");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ReflectiveOperationException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Error Loading Decorator: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "addTagLibraries", "(Lcom/sun/faces/facelets/compiler/Compiler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/core/CoreLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/core/CoreLibrary", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/core/CoreLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf/core");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/core/CoreLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf/html");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/ui/UILibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/ui/UILibrary", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/ui/UILibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf/facelets");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/ui/UILibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://java.sun.com/jstl/core");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsp/jstl/core");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/PassThroughAttributeLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/PassThroughAttributeLibrary", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/PassThroughElementLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/PassThroughElementLibrary", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/util/FunctionLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/fn/JstlFunction;"));
methodVisitor.visitLdcInsn("http://java.sun.com/jsp/jstl/functions");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/util/FunctionLibrary", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/util/FunctionLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/fn/JstlFunction;"));
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsp/jstl/functions");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/util/FunctionLibrary", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "isDevModeEnabled", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/util/FunctionLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/util/DevTools;"));
methodVisitor.visitLdcInsn("http://java.sun.com/mojarra/private/functions");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/util/FunctionLibrary", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/util/FunctionLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/util/DevTools;"));
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/mojarra/private/functions");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/util/FunctionLibrary", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/CompositeLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/CompositeLibrary", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/composite/CompositeLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf/composite");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/composite/CompositeLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/compiler/Compiler", "addTagLibrary", "(Lcom/sun/faces/facelets/tag/TagLibrary;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$addNavigationCase$1", "(Ljava/lang/String;)Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashSet", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$addFacesComponent$0", "(Ljava/lang/String;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/faces/application/ApplicationAssociate;)Ljavax/faces/flow/FlowHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "flowHandler", "Ljavax/faces/flow/FlowHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lcom/sun/faces/application/ApplicationAssociate;Ljavax/faces/flow/FlowHandler;)Ljavax/faces/flow/FlowHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "flowHandler", "Ljavax/faces/flow/FlowHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lcom/sun/faces/application/ApplicationAssociate;)Ljavax/faces/component/search/SearchExpressionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate", "searchExpressionHandler", "Ljavax/faces/component/search/SearchExpressionHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lcom/sun/faces/application/ApplicationAssociate;Ljavax/faces/component/search/SearchExpressionHandler;)Ljavax/faces/component/search/SearchExpressionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate", "searchExpressionHandler", "Ljavax/faces/component/search/SearchExpressionHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "()Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ApplicationAssociate", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ApplicationAssociate$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ApplicationAssociate$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ApplicationAssociate", "instance", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
