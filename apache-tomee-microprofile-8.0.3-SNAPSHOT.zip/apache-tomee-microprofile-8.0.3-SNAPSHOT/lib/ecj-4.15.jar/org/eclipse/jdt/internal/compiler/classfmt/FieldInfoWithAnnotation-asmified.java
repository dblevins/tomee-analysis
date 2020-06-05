package asm.org.eclipse.jdt.internal.compiler.classfmt;
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
public class FieldInfoWithAnnotationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", null, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/classfmt/FieldInfo;[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "reference", "[B");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "constantPoolOffsets", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "structOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "version", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "<init>", "([B[IIJ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "accessFlags", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "accessFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "attributeBytes", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "attributeBytes", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "constant", "Lorg/eclipse/jdt/internal/compiler/impl/Constant;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "constant", "Lorg/eclipse/jdt/internal/compiler/impl/Constant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "constantPoolOffsets", "[I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "constantPoolOffsets", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "descriptor", "[C");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "descriptor", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "name", "[C");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "name", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "signature", "[C");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "signature", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "signatureUtf8Offset", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "signatureUtf8Offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "tagBits", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "tagBits", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "wrappedConstantValue", "Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "wrappedConstantValue", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotations", "()[Lorg/eclipse/jdt/internal/compiler/env/IBinaryAnnotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo", "initialize", "()V", false);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "initialize", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo", "reset", "()V", false);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfo", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/StringBuffer", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "annotations", "[Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/FieldInfoWithAnnotation", "toStringContent", "(Ljava/lang/StringBuffer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}