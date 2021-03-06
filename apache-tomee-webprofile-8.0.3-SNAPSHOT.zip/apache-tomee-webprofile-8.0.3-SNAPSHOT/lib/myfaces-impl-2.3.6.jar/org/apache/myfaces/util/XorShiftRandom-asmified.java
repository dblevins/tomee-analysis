package asm.org.apache.myfaces.util;
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
public class XorShiftRandomDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/util/XorShiftRandom", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/util/XorShiftRandom", "value", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "random", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/util/XorShiftRandom", "value", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/util/XorShiftRandom", "random", "(J)J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/util/XorShiftRandom", "value", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/util/XorShiftRandom", "value", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "random", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
