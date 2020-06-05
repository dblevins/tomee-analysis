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
public class JCSCacheMXBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/cache/management/CacheMXBean;", "java/lang/Object", new String[] { "javax/cache/management/CacheMXBean" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljavax/cache/Cache;", "Ljavax/cache/Cache<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/cache/Cache;)V", "(Ljavax/cache/Cache<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "delegate", "Ljavax/cache/Cache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "config", "()Ljavax/cache/configuration/Configuration;", "()Ljavax/cache/configuration/Configuration<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "delegate", "Ljavax/cache/Cache;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/cache/configuration/Configuration;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/Cache", "getConfiguration", "(Ljava/lang/Class;)Ljavax/cache/configuration/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "completeConfig", "()Ljavax/cache/configuration/CompleteConfiguration;", "()Ljavax/cache/configuration/CompleteConfiguration<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "delegate", "Ljavax/cache/Cache;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/cache/configuration/CompleteConfiguration;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/Cache", "getConfiguration", "(Ljava/lang/Class;)Ljavax/cache/configuration/Configuration;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/cache/configuration/CompleteConfiguration");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "config", "()Ljavax/cache/configuration/Configuration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/configuration/Configuration", "getKeyType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "config", "()Ljavax/cache/configuration/Configuration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/configuration/Configuration", "getValueType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReadThrough", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "completeConfig", "()Ljavax/cache/configuration/CompleteConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/configuration/CompleteConfiguration", "isReadThrough", "()Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWriteThrough", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "completeConfig", "()Ljavax/cache/configuration/CompleteConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/configuration/CompleteConfiguration", "isWriteThrough", "()Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStoreByValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "config", "()Ljavax/cache/configuration/Configuration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/configuration/Configuration", "isStoreByValue", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStatisticsEnabled", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "completeConfig", "()Ljavax/cache/configuration/CompleteConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/configuration/CompleteConfiguration", "isStatisticsEnabled", "()Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isManagementEnabled", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/jmx/JCSCacheMXBean", "completeConfig", "()Ljavax/cache/configuration/CompleteConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/configuration/CompleteConfiguration", "isManagementEnabled", "()Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
