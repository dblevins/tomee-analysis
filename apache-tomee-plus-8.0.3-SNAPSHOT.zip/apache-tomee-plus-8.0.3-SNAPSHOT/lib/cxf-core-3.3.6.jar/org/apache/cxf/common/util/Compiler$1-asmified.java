package asm.org.apache.cxf.common.util;
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
public class Compiler$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/common/util/Compiler$1", "Ljava/lang/Object;Ljavax/tools/DiagnosticListener<Ljavax/tools/JavaFileObject;>;", "java/lang/Object", new String[] { "javax/tools/DiagnosticListener" });

classWriter.visitOuterClass("org/apache/cxf/common/util/Compiler", "setupDiagnosticListener", "()Ljavax/tools/DiagnosticListener;");

classWriter.visitInnerClass("org/apache/cxf/common/util/Compiler$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/common/util/Compiler$2", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("javax/tools/Diagnostic$Kind", "javax/tools/Diagnostic", "Kind", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/common/util/Compiler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/common/util/Compiler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/common/util/Compiler$1", "this$0", "Lorg/apache/cxf/common/util/Compiler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "report", "(Ljavax/tools/Diagnostic;)V", "(Ljavax/tools/Diagnostic<+Ljavax/tools/JavaFileObject;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/common/util/Compiler$2", "$SwitchMap$javax$tools$Diagnostic$Kind", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/tools/Diagnostic", "getKind", "()Ljavax/tools/Diagnostic$Kind;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/tools/Diagnostic$Kind", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label2, new Label[] { label0, label1, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/util/Compiler$1", "this$0", "Lorg/apache/cxf/common/util/Compiler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/Compiler", "access$000", "(Lorg/apache/cxf/common/util/Compiler;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/util/Compiler$1", "this$0", "Lorg/apache/cxf/common/util/Compiler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/Compiler", "access$100", "(Lorg/apache/cxf/common/util/Compiler;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/util/Compiler$1", "this$0", "Lorg/apache/cxf/common/util/Compiler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/Compiler", "access$200", "(Lorg/apache/cxf/common/util/Compiler;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/util/Compiler$1", "this$0", "Lorg/apache/cxf/common/util/Compiler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/Compiler", "access$100", "(Lorg/apache/cxf/common/util/Compiler;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "err", "Ljava/io/PrintStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
