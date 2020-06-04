package asm.org.apache.jasper.compiler;
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
public class Validator$ValidateVisitor$XmlEscapeNonELVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jasper/compiler/Validator$ValidateVisitor$XmlEscapeNonELVisitor", null, "org/apache/jasper/compiler/ELParser$TextBuilder", null);

classWriter.visitInnerClass("org/apache/jasper/compiler/Validator$ValidateVisitor", "org/apache/jasper/compiler/Validator", "ValidateVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Validator$ValidateVisitor$XmlEscapeNonELVisitor", "org/apache/jasper/compiler/Validator$ValidateVisitor", "XmlEscapeNonELVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/ELNode$Text", "org/apache/jasper/compiler/ELNode", "Text", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/ELParser$TextBuilder", "org/apache/jasper/compiler/ELParser", "TextBuilder", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/ELParser$TextBuilder", "<init>", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/ELNode$Text;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$XmlEscapeNonELVisitor", "output", "Ljava/lang/StringBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ELNode$Text", "getText", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/security/Escape", "xml", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$XmlEscapeNonELVisitor", "isDeferredSyntaxAllowedAsLiteral", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/ELParser", "escapeLiteralExpression", "(Ljava/lang/String;Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
