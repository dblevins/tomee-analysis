package asm.org.apache.commons.jcs.jcache.jmx;
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
public class ConfigurableMBeanServerIdBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", null, "javax/management/MBeanServerBuilder", null);

classWriter.visitInnerClass("org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$1", "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", "ForceIdMBeanServerDelegate", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$Key", "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", "Key", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "JVM_SINGLETONS", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/ConcurrentMap<Lorg/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$Key;Ljavax/management/MBeanServer;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanServerBuilder", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newMBeanServer", "(Ljava/lang/String;Ljavax/management/MBeanServer;Ljavax/management/MBeanServerDelegate;)Ljavax/management/MBeanServer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$Key", "<init>", "(Ljava/lang/String;Ljavax/management/MBeanServer;Lorg/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", "JVM_SINGLETONS", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/management/MBeanServer");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$ForceIdMBeanServerDelegate", "<init>", "(Lorg/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder;Ljavax/management/MBeanServerDelegate;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/MBeanServerBuilder", "newMBeanServer", "(Ljava/lang/String;Ljavax/management/MBeanServer;Ljavax/management/MBeanServerDelegate;)Ljavax/management/MBeanServer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", "JVM_SINGLETONS", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "putIfAbsent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/management/MBeanServer");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder$Key", "javax/management/MBeanServer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/jcache/jmx/ConfigurableMBeanServerIdBuilder", "JVM_SINGLETONS", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
