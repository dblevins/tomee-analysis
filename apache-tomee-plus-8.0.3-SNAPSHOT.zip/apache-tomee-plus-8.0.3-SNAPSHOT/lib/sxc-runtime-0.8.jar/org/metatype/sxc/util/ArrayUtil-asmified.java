package asm.org.metatype.sxc.util;
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
public class ArrayUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/metatype/sxc/util/ArrayUtil", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/metatype/sxc/util/ArrayUtil$DoubleArray", "org/metatype/sxc/util/ArrayUtil", "DoubleArray", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/util/ArrayUtil$FloatArray", "org/metatype/sxc/util/ArrayUtil", "FloatArray", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/util/ArrayUtil$LongArray", "org/metatype/sxc/util/ArrayUtil", "LongArray", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/util/ArrayUtil$IntArray", "org/metatype/sxc/util/ArrayUtil", "IntArray", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/util/ArrayUtil$ShortArray", "org/metatype/sxc/util/ArrayUtil", "ShortArray", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/util/ArrayUtil$CharArray", "org/metatype/sxc/util/ArrayUtil", "CharArray", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/util/ArrayUtil$BooleanArray", "org/metatype/sxc/util/ArrayUtil", "BooleanArray", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INITIAL_SIZE", "I", null, new Integer(10));
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
