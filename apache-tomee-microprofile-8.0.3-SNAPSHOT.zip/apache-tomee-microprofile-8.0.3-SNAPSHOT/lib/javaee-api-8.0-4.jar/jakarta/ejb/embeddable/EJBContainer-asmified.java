package asm.jakarta.ejb.embeddable;
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
public class EJBContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/ejb/embeddable/EJBContainer", null, "java/lang/Object", new String[] { "java/lang/AutoCloseable" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROVIDER", "Ljava/lang/String;", null, "jakarta.ejb.embeddable.provider");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APP_NAME", "Ljava/lang/String;", null, "jakarta.ejb.embeddable.appName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULES", "Ljava/lang/String;", null, "jakarta.ejb.embeddable.modules");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "close", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createEJBContainer", "()Ljakarta/ejb/embeddable/EJBContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_MAP", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ejb/embeddable/EJBContainer", "createEJBContainer", "(Ljava/util/Map;)Ljakarta/ejb/embeddable/EJBContainer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createEJBContainer", "(Ljava/util/Map;)Ljakarta/ejb/embeddable/EJBContainer;", "(Ljava/util/Map<**>;)Ljakarta/ejb/embeddable/EJBContainer;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/ejb/EJBException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label3, label2, label2, "jakarta/ejb/EJBException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "java/lang/Exception");
methodVisitor.visitTryCatchBlock(label3, label2, label4, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_MAP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/spi/EJBContainerProvider;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/embeddable/EJBContainer;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/osgi/locator/ProviderLocator", "getServices", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/ClassLoader", "java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ejb/spi/EJBContainerProvider");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ejb/spi/EJBContainerProvider", "createEJBContainer", "(Ljava/util/Map;)Ljakarta/ejb/embeddable/EJBContainer;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/EJBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Provider error. No provider definition found");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/EJBException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/util/Map"}, 1, new Object[] {"jakarta/ejb/EJBException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/ejb/EJBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Provider error. No provider found");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ejb/EJBException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContext", "()Ljavax/naming/Context;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
