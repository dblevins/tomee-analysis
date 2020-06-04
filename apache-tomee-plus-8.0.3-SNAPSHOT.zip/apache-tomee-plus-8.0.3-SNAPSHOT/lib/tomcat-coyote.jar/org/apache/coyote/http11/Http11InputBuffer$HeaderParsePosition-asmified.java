package asm.org.apache.coyote.http11;
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
public class Http11InputBuffer$HeaderParsePositionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "Ljava/lang/Enum<Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "org/apache/coyote/http11/Http11InputBuffer", "HeaderParsePosition", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER_START", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER_NAME", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER_VALUE_START", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER_VALUE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER_MULTI_LINE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER_SKIPLINE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "$VALUES", "[Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER_START");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_START", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER_NAME");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_NAME", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER_VALUE_START");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_VALUE_START", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER_VALUE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_VALUE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER_MULTI_LINE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_MULTI_LINE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER_SKIPLINE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_SKIPLINE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_START", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_NAME", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_VALUE_START", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_VALUE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_MULTI_LINE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "HEADER_SKIPLINE", "Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition", "$VALUES", "[Lorg/apache/coyote/http11/Http11InputBuffer$HeaderParsePosition;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
