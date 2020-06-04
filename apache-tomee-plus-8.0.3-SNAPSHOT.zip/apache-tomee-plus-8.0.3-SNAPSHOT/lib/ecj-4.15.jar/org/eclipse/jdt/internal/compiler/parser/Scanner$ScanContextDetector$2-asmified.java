package asm.org.eclipse.jdt.internal.compiler.parser;
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
public class Scanner$ScanContextDetector$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$2", null, "org/eclipse/jdt/internal/compiler/parser/Scanner$Goal", null);

classWriter.visitOuterClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "getScanContext", "([CI)Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext;");

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$Goal", "org/eclipse/jdt/internal/compiler/parser/Scanner", "Goal", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext", "org/eclipse/jdt/internal/compiler/parser/Scanner", "ScanContext", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector", "org/eclipse/jdt/internal/compiler/parser/Scanner", "ScanContextDetector", ACC_PRIVATE);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector;I[II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector$2", "this$1", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContextDetector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$Goal", "<init>", "(I[II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "hasBeenReached", "(II)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 62);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
