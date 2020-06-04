package asm.org.apache.catalina.ssi;
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
public class ExpressionParseTree$OppNodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", null, "org/apache/catalina/ssi/ExpressionParseTree$Node", null);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$Node", "org/apache/catalina/ssi/ExpressionParseTree", "Node", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$OppNode", "org/apache/catalina/ssi/ExpressionParseTree", "OppNode", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/catalina/ssi/ExpressionParseTree$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(0, "left", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "right", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/ssi/ExpressionParseTree;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "this$0", "Lorg/apache/catalina/ssi/ExpressionParseTree;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$Node", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrecedence", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "popValues", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/catalina/ssi/ExpressionParseTree$Node;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/ssi/ExpressionParseTree$Node");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "right", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/ssi/ExpressionParseTree$Node");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "left", "Lorg/apache/catalina/ssi/ExpressionParseTree$Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;Lorg/apache/catalina/ssi/ExpressionParseTree$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ssi/ExpressionParseTree$OppNode", "<init>", "(Lorg/apache/catalina/ssi/ExpressionParseTree;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
