package asm.org.apache.catalina.storeconfig;
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
public class StoreConfigLifecycleListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", null, "java/lang/Object", new String[] { "org/apache/catalina/LifecycleListener" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "registry", "Lorg/apache/tomcat/util/modeler/Registry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "storeConfig", "Lorg/apache/catalina/storeconfig/IStoreConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "storeConfigClass", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "storeRegistry", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "oname", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/mbeans/MBeanUtils", "createRegistry", "()Lorg/apache/tomcat/util/modeler/Registry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "registry", "Lorg/apache/tomcat/util/modeler/Registry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.apache.catalina.storeconfig.StoreConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfigClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeRegistry", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lifecycleEvent", "(Lorg/apache/catalina/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("after_start");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/LifecycleEvent", "getType", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/LifecycleEvent", "getSource", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/Server");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/LifecycleEvent", "getSource", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/Server");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "createMBean", "(Lorg/apache/catalina/Server;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("storeConfigListener.notServer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("after_stop");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/LifecycleEvent", "getType", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "registry", "Lorg/apache/tomcat/util/modeler/Registry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/modeler/Registry", "unregisterComponent", "(Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createMBean", "(Lorg/apache/catalina/Server;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/storeconfig/StoreLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/storeconfig/StoreLoader", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "getStoreConfigClass", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/storeconfig/IStoreConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfig", "Lorg/apache/catalina/storeconfig/IStoreConfig;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "getStoreRegistry", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StoreLoader", "load", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfig", "Lorg/apache/catalina/storeconfig/IStoreConfig;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/storeconfig/StoreLoader", "getRegistry", "()Lorg/apache/catalina/storeconfig/StoreRegistry;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/storeconfig/IStoreConfig", "setRegistry", "(Lorg/apache/catalina/storeconfig/StoreRegistry;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfig", "Lorg/apache/catalina/storeconfig/IStoreConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/storeconfig/IStoreConfig", "setServer", "(Lorg/apache/catalina/Server;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "org/apache/catalina/Server", "org/apache/catalina/storeconfig/StoreLoader"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("storeConfigListener.loadError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/management/ObjectName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Catalina:type=StoreConfig");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/ObjectName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "registry", "Lorg/apache/tomcat/util/modeler/Registry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfig", "Lorg/apache/catalina/storeconfig/IStoreConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitLdcInsn("StoreConfig");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/modeler/Registry", "registerComponent", "(Ljava/lang/Object;Ljavax/management/ObjectName;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("storeConfigListener.registerError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getManagedBean", "(Ljava/lang/Object;)Ljavax/management/DynamicMBean;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "registry", "Lorg/apache/tomcat/util/modeler/Registry;");
methodVisitor.visitLdcInsn("StoreConfig");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/modeler/Registry", "findManagedBean", "(Ljava/lang/String;)Lorg/apache/tomcat/util/modeler/ManagedBean;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/modeler/ManagedBean", "createMBean", "(Ljava/lang/Object;)Ljavax/management/DynamicMBean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreConfig", "()Lorg/apache/catalina/storeconfig/IStoreConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfig", "Lorg/apache/catalina/storeconfig/IStoreConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStoreConfig", "(Lorg/apache/catalina/storeconfig/IStoreConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfig", "Lorg/apache/catalina/storeconfig/IStoreConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreConfigClass", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfigClass", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStoreConfigClass", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeConfigClass", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreRegistry", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeRegistry", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStoreRegistry", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "storeRegistry", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/storeconfig/StoreConfigLifecycleListener;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/storeconfig/StoreConfigLifecycleListener;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/storeconfig/StoreConfigLifecycleListener", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
