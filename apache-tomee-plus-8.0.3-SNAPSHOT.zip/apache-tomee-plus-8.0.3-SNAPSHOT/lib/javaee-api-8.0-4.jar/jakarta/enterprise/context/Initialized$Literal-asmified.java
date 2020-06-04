package asm.jakarta.enterprise.context;
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
public class Initialized$LiteralDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "jakarta/enterprise/context/Initialized$Literal", "Ljakarta/enterprise/util/AnnotationLiteral<Ljakarta/enterprise/context/Initialized;>;Ljakarta/enterprise/context/Initialized;", "jakarta/enterprise/util/AnnotationLiteral", new String[] { "jakarta/enterprise/context/Initialized" });

classWriter.visitInnerClass("jakarta/enterprise/context/Initialized$Literal", "jakarta/enterprise/context/Initialized", "Literal", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPLICATION", "Ljakarta/enterprise/context/Initialized$Literal;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION", "Ljakarta/enterprise/context/Initialized$Literal;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONVERSATION", "Ljakarta/enterprise/context/Initialized$Literal;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST", "Ljakarta/enterprise/context/Initialized$Literal;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "Ljava/lang/Class;", "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "of", "(Ljava/lang/Class;)Ljakarta/enterprise/context/Initialized$Literal;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/context/Initialized$Literal;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/context/Initialized$Literal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/context/Initialized$Literal", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/util/AnnotationLiteral", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/enterprise/context/Initialized$Literal", "value", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/enterprise/context/Initialized$Literal", "value", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/ApplicationScoped;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/enterprise/context/Initialized$Literal", "of", "(Ljava/lang/Class;)Ljakarta/enterprise/context/Initialized$Literal;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/context/Initialized$Literal", "APPLICATION", "Ljakarta/enterprise/context/Initialized$Literal;");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/SessionScoped;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/enterprise/context/Initialized$Literal", "of", "(Ljava/lang/Class;)Ljakarta/enterprise/context/Initialized$Literal;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/context/Initialized$Literal", "SESSION", "Ljakarta/enterprise/context/Initialized$Literal;");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/ConversationScoped;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/enterprise/context/Initialized$Literal", "of", "(Ljava/lang/Class;)Ljakarta/enterprise/context/Initialized$Literal;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/context/Initialized$Literal", "CONVERSATION", "Ljakarta/enterprise/context/Initialized$Literal;");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/RequestScoped;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/enterprise/context/Initialized$Literal", "of", "(Ljava/lang/Class;)Ljakarta/enterprise/context/Initialized$Literal;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/context/Initialized$Literal", "REQUEST", "Ljakarta/enterprise/context/Initialized$Literal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
