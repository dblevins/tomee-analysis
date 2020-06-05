package asm.jakarta.servlet.jsp.jstl.tlv;
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
public class ScriptFreeTLV$MyContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", null, "org/xml/sax/helpers/DefaultHandler", null);

classWriter.visitInnerClass("jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV", "MyContentHandler", ACC_PRIVATE);

classWriter.visitInnerClass("jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$1", "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV", null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "declarationCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "scriptletCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expressionCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rtExpressionCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "this$0", "Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "declarationCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "scriptletCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "expressionCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "rtExpressionCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "this$0", "Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV", "access$100", "(Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("jsp:declaration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "declarationCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "declarationCount", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "this$0", "Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV", "access$200", "(Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("jsp:scriptlet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "scriptletCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "scriptletCount", "I");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "this$0", "Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV", "access$300", "(Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("jsp:expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "expressionCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "expressionCount", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "this$0", "Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV", "access$400", "(Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "countRTExpressions", "(Lorg/xml/sax/Attributes;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "countRTExpressions", "(Lorg/xml/sax/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLength", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("%=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("%");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "rtExpressionCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "rtExpressionCount", "I");
methodVisitor.visitLabel(label2);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reportResults", "()[Ljakarta/servlet/jsp/tagext/ValidationMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "declarationCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "scriptletCount", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "expressionCount", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "rtExpressionCount", "I");
methodVisitor.visitInsn(IADD);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JSP page contains ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "declarationCount", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "declarationCount", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" declaration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "declarationCount", "I");
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "scriptletCount", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "scriptletCount", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" scriptlet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "scriptletCount", "I");
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "expressionCount", "I");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "expressionCount", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" expression");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "expressionCount", "I");
methodVisitor.visitInsn(ICONST_1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "rtExpressionCount", "I");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFLE, label9);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "rtExpressionCount", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" request-time attribute value");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "rtExpressionCount", "I");
methodVisitor.visitInsn(ICONST_1);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV", "access$500", "(Ljava/lang/String;)[Ljakarta/servlet/jsp/tagext/ValidationMessage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV$MyContentHandler", "<init>", "(Ljakarta/servlet/jsp/jstl/tlv/ScriptFreeTLV;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}