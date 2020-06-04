package asm.org.apache.johnzon.jsonb.cdi;
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
public class CDIsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/johnzon/jsonb/cdi/CDIs", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/cdi/CDIs$Lazy", "org/apache/johnzon/jsonb/cdi/CDIs", "Lazy", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tracker", "Lorg/apache/johnzon/jsonb/cdi/JohnzonCdiExtension;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/jsonb/cdi/CDIs$Lazy", "access$000", "(Ljava/lang/Object;)Lorg/apache/johnzon/jsonb/cdi/JohnzonCdiExtension;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/cdi/CDIs", "tracker", "Lorg/apache/johnzon/jsonb/cdi/JohnzonCdiExtension;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "track", "(Lorg/apache/johnzon/jsonb/JohnzonJsonb;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/cdi/CDIs", "tracker", "Lorg/apache/johnzon/jsonb/cdi/JohnzonCdiExtension;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/cdi/JohnzonCdiExtension", "track", "(Lorg/apache/johnzon/jsonb/JohnzonJsonb;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "untrack", "(Lorg/apache/johnzon/jsonb/JohnzonJsonb;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/cdi/CDIs", "tracker", "Lorg/apache/johnzon/jsonb/cdi/JohnzonCdiExtension;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/cdi/JohnzonCdiExtension", "untrack", "(Lorg/apache/johnzon/jsonb/JohnzonJsonb;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCanWrite", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/cdi/CDIs", "tracker", "Lorg/apache/johnzon/jsonb/cdi/JohnzonCdiExtension;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/cdi/JohnzonCdiExtension", "isCanWrite", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
