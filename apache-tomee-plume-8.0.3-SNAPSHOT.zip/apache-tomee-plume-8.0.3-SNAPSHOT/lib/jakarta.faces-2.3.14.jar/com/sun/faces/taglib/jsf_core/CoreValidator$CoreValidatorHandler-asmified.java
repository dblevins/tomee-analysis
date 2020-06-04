package asm.com.sun.faces.taglib.jsf_core;
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
public class CoreValidator$CoreValidatorHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", null, "org/xml/sax/helpers/DefaultHandler", null);

classWriter.visitInnerClass("com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "com/sun/faces/taglib/jsf_core/CoreValidator", "CoreValidatorHandler", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/taglib/jsf_core/CoreValidator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$100", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setNameSpace", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setLocalName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setQName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setAttributes", "(Lorg/xml/sax/Attributes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setValidator", "(Lcom/sun/faces/taglib/FacesValidator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$300", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/jsf_core/IdTagParserImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/jsf_core/IdTagParserImpl", "parseStartElement", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$300", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/jsf_core/IdTagParserImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/jsf_core/IdTagParserImpl", "hasFailed", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$402", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$500", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/jsf_core/CoreTagParserImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/jsf_core/CoreTagParserImpl", "parseStartElement", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$500", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/jsf_core/CoreTagParserImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/jsf_core/CoreTagParserImpl", "hasFailed", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$602", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setNameSpace", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setLocalName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$200", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/ValidatorInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/ValidatorInfo", "setQName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$300", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/jsf_core/IdTagParserImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/jsf_core/IdTagParserImpl", "parseEndElement", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "this$0", "Lcom/sun/faces/taglib/jsf_core/CoreValidator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/taglib/jsf_core/CoreValidator", "access$500", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)Lcom/sun/faces/taglib/jsf_core/CoreTagParserImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/taglib/jsf_core/CoreTagParserImpl", "parseEndElement", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;Lcom/sun/faces/taglib/jsf_core/CoreValidator$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/taglib/jsf_core/CoreValidator$CoreValidatorHandler", "<init>", "(Lcom/sun/faces/taglib/jsf_core/CoreValidator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
