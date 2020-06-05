package asm.org.apache.catalina;
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
public class ContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/catalina/Container", null, "java/lang/Object", new String[] { "org/apache/catalina/Lifecycle" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADD_CHILD_EVENT", "Ljava/lang/String;", null, "addChild");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADD_VALVE_EVENT", "Ljava/lang/String;", null, "addValve");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REMOVE_CHILD_EVENT", "Ljava/lang/String;", null, "removeChild");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REMOVE_VALVE_EVENT", "Ljava/lang/String;", null, "removeValve");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLogger", "()Lorg/apache/juli/logging/Log;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLogName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObjectName", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDomain", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMBeanKeyProperties", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPipeline", "()Lorg/apache/catalina/Pipeline;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCluster", "()Lorg/apache/catalina/Cluster;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCluster", "(Lorg/apache/catalina/Cluster;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBackgroundProcessorDelay", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBackgroundProcessorDelay", "(I)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParent", "()Lorg/apache/catalina/Container;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParent", "(Lorg/apache/catalina/Container;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParentClassLoader", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParentClassLoader", "(Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRealm", "()Lorg/apache/catalina/Realm;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRealm", "(Lorg/apache/catalina/Realm;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getConfigPath", "(Lorg/apache/catalina/Container;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/StringBuffer", "org/apache/catalina/Container", "org/apache/catalina/Container"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/Host");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/Engine");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Container", "getParent", "()Lorg/apache/catalina/Container;", true);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/Host");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Host", "getXmlBase", "()Ljava/lang/String;", true);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/Host");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Host", "getXmlBase", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("conf/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Container", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Container", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getService", "(Lorg/apache/catalina/Container;)Lorg/apache/catalina/Service;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/Engine");
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Container", "getParent", "()Lorg/apache/catalina/Container;", true);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/Engine");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Engine", "getService", "()Lorg/apache/catalina/Service;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "backgroundProcess", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChild", "(Lorg/apache/catalina/Container;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addContainerListener", "(Lorg/apache/catalina/ContainerListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPropertyChangeListener", "(Ljava/beans/PropertyChangeListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findChild", "(Ljava/lang/String;)Lorg/apache/catalina/Container;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findChildren", "()[Lorg/apache/catalina/Container;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findContainerListeners", "()[Lorg/apache/catalina/ContainerListener;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeChild", "(Lorg/apache/catalina/Container;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeContainerListener", "(Lorg/apache/catalina/ContainerListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removePropertyChangeListener", "(Ljava/beans/PropertyChangeListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fireContainerEvent", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "logAccess", "(Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;JZ)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAccessLog", "()Lorg/apache/catalina/AccessLog;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStartStopThreads", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setStartStopThreads", "(I)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCatalinaBase", "()Ljava/io/File;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCatalinaHome", "()Ljava/io/File;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
