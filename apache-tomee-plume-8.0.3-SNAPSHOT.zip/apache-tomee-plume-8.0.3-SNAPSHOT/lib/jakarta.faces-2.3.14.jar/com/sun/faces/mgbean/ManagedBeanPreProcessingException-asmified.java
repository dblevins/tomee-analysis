package asm.com.sun.faces.mgbean;
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
public class ManagedBeanPreProcessingExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", null, "jakarta/faces/FacesException", null);

classWriter.visitInnerClass("com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(5355477597212764294L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Throwable;Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/ManagedBeanPreProcessingException$Type", "CHECKED", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/ManagedBeanPreProcessingException", "type", "Lcom/sun/faces/mgbean/ManagedBeanPreProcessingException$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
