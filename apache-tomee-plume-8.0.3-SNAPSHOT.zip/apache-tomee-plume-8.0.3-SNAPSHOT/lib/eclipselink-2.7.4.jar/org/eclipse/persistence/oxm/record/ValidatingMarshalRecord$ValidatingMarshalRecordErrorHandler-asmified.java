package asm.org.eclipse.persistence.oxm.record;
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
public class ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", null, "java/lang/Object", new String[] { "org/xml/sax/ErrorHandler" });

classWriter.visitInnerClass("org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$MarshalSAXParseException", "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord", "MarshalSAXParseException", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord", "ValidatingMarshalRecordErrorHandler", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "marshalRecord", "Lorg/eclipse/persistence/oxm/record/MarshalRecord;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "errorHandler", "Lorg/xml/sax/ErrorHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/oxm/record/MarshalRecord;Lorg/xml/sax/ErrorHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "marshalRecord", "Lorg/eclipse/persistence/oxm/record/MarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "errorHandler", "Lorg/xml/sax/ErrorHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "warning", "(Lorg/xml/sax/SAXParseException;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "errorHandler", "Lorg/xml/sax/ErrorHandler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "errorHandler", "Lorg/xml/sax/ErrorHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "marshalSAXParseException", "(Lorg/xml/sax/SAXParseException;)Lorg/eclipse/persistence/oxm/record/ValidatingMarshalRecord$MarshalSAXParseException;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/ErrorHandler", "warning", "(Lorg/xml/sax/SAXParseException;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "error", "(Lorg/xml/sax/SAXParseException;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "errorHandler", "Lorg/xml/sax/ErrorHandler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "errorHandler", "Lorg/xml/sax/ErrorHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "marshalSAXParseException", "(Lorg/xml/sax/SAXParseException;)Lorg/eclipse/persistence/oxm/record/ValidatingMarshalRecord$MarshalSAXParseException;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/ErrorHandler", "error", "(Lorg/xml/sax/SAXParseException;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fatalError", "(Lorg/xml/sax/SAXParseException;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "errorHandler", "Lorg/xml/sax/ErrorHandler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "errorHandler", "Lorg/xml/sax/ErrorHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "marshalSAXParseException", "(Lorg/xml/sax/SAXParseException;)Lorg/eclipse/persistence/oxm/record/ValidatingMarshalRecord$MarshalSAXParseException;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/ErrorHandler", "fatalError", "(Lorg/xml/sax/SAXParseException;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "marshalSAXParseException", "(Lorg/xml/sax/SAXParseException;)Lorg/eclipse/persistence/oxm/record/ValidatingMarshalRecord$MarshalSAXParseException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$MarshalSAXParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getLocalizedMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getPublicId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getSystemId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getLineNumber", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getColumnNumber", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/SAXParseException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$ValidatingMarshalRecordErrorHandler", "marshalRecord", "Lorg/eclipse/persistence/oxm/record/MarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/MarshalRecord", "getOwningObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/record/ValidatingMarshalRecord$MarshalSAXParseException", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Exception;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
