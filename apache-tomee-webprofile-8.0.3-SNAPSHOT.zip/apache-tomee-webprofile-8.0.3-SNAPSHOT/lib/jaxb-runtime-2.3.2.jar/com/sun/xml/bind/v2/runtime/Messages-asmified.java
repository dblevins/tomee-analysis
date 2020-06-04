package asm.com.sun.xml.bind.v2.runtime;
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
public class MessagesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/bind/v2/runtime/Messages", "Ljava/lang/Enum<Lcom/sun/xml/bind/v2/runtime/Messages;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ILLEGAL_PARAMETER", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNABLE_TO_FIND_CONVERSION_METHOD", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MISSING_ID", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_IMPLEMENTED_IN_2_0", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNRECOGNIZED_ELEMENT_NAME", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TYPE_MISMATCH", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MISSING_OBJECT", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_IDENTIFIABLE", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DANGLING_IDREF", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NULL_OUTPUT_RESOLVER", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNABLE_TO_MARSHAL_NON_ELEMENT", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNABLE_TO_MARSHAL_UNBOUND_CLASS", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NULL_PROPERTY_NAME", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MUST_BE_X", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_MARSHALLABLE", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED_RESULT", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED_ENCODING", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUBSTITUTED_BY_ANONYMOUS_TYPE", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CYCLE_IN_MARSHALLER", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNABLE_TO_DISCOVER_EVENTHANDLER", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEMENT_NEEDED_BUT_FOUND_DOCUMENT", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNKNOWN_CLASS", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILED_TO_GENERATE_SCHEMA", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ERROR_PROCESSING_SCHEMA", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ILLEGAL_CONTENT", "Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "rb", "Ljava/util/ResourceBundle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/xml/bind/v2/runtime/Messages;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/runtime/Messages;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/Messages", "format", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "format", "([Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/Messages", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ILLEGAL_PARAMETER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ILLEGAL_PARAMETER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNABLE_TO_FIND_CONVERSION_METHOD");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_FIND_CONVERSION_METHOD", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISSING_ID");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "MISSING_ID", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_IMPLEMENTED_IN_2_0");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NOT_IMPLEMENTED_IN_2_0", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNRECOGNIZED_ELEMENT_NAME");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNRECOGNIZED_ELEMENT_NAME", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TYPE_MISMATCH");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "TYPE_MISMATCH", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISSING_OBJECT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "MISSING_OBJECT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_IDENTIFIABLE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NOT_IDENTIFIABLE", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DANGLING_IDREF");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "DANGLING_IDREF", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NULL_OUTPUT_RESOLVER");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NULL_OUTPUT_RESOLVER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNABLE_TO_MARSHAL_NON_ELEMENT");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_MARSHAL_NON_ELEMENT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNABLE_TO_MARSHAL_UNBOUND_CLASS");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_MARSHAL_UNBOUND_CLASS", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_PROPERTY");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NULL_PROPERTY_NAME");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NULL_PROPERTY_NAME", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MUST_BE_X");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "MUST_BE_X", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_MARSHALLABLE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NOT_MARSHALLABLE", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_RESULT");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNSUPPORTED_RESULT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_ENCODING");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNSUPPORTED_ENCODING", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUBSTITUTED_BY_ANONYMOUS_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "SUBSTITUTED_BY_ANONYMOUS_TYPE", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CYCLE_IN_MARSHALLER");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "CYCLE_IN_MARSHALLER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNABLE_TO_DISCOVER_EVENTHANDLER");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_DISCOVER_EVENTHANDLER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEMENT_NEEDED_BUT_FOUND_DOCUMENT");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ELEMENT_NEEDED_BUT_FOUND_DOCUMENT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNKNOWN_CLASS");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNKNOWN_CLASS", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILED_TO_GENERATE_SCHEMA");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "FAILED_TO_GENERATE_SCHEMA", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ERROR_PROCESSING_SCHEMA");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ERROR_PROCESSING_SCHEMA", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ILLEGAL_CONTENT");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ILLEGAL_CONTENT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/bind/v2/runtime/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ILLEGAL_PARAMETER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_FIND_CONVERSION_METHOD", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "MISSING_ID", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NOT_IMPLEMENTED_IN_2_0", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNRECOGNIZED_ELEMENT_NAME", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "TYPE_MISMATCH", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "MISSING_OBJECT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NOT_IDENTIFIABLE", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "DANGLING_IDREF", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NULL_OUTPUT_RESOLVER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_MARSHAL_NON_ELEMENT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_MARSHAL_UNBOUND_CLASS", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNSUPPORTED_PROPERTY", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NULL_PROPERTY_NAME", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "MUST_BE_X", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "NOT_MARSHALLABLE", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNSUPPORTED_RESULT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNSUPPORTED_ENCODING", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "SUBSTITUTED_BY_ANONYMOUS_TYPE", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "CYCLE_IN_MARSHALLER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_DISCOVER_EVENTHANDLER", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ELEMENT_NEEDED_BUT_FOUND_DOCUMENT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNKNOWN_CLASS", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "FAILED_TO_GENERATE_SCHEMA", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ERROR_PROCESSING_SCHEMA", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "ILLEGAL_CONTENT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/runtime/Messages;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ResourceBundle", "getBundle", "(Ljava/lang/String;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
