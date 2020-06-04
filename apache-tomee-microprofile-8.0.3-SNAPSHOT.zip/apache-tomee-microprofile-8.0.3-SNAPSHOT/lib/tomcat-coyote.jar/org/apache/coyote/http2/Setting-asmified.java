package asm.org.apache.coyote.http2;
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
public class SettingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/coyote/http2/Setting", "Ljava/lang/Enum<Lorg/apache/coyote/http2/Setting;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER_TABLE_SIZE", "Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENABLE_PUSH", "Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAX_CONCURRENT_STREAMS", "Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INITIAL_WINDOW_SIZE", "Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAX_FRAME_SIZE", "Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAX_HEADER_LIST_SIZE", "Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNKNOWN", "Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "id", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/coyote/http2/Setting;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/coyote/http2/Setting;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "$VALUES", "[Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/coyote/http2/Setting;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/coyote/http2/Setting;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/http2/Setting;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/Setting", "id", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "getId", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Setting", "id", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/Setting", "id", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_STATIC, "valueOf", "(I)Lorg/apache/coyote/http2/Setting;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTableSwitchInsn(1, 6, label6, new Label[] { label0, label1, label2, label3, label4, label5 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "HEADER_TABLE_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "ENABLE_PUSH", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "MAX_CONCURRENT_STREAMS", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "INITIAL_WINDOW_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "MAX_FRAME_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "MAX_HEADER_LIST_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "UNKNOWN", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER_TABLE_SIZE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Setting", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "HEADER_TABLE_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENABLE_PUSH");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Setting", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "ENABLE_PUSH", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAX_CONCURRENT_STREAMS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Setting", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "MAX_CONCURRENT_STREAMS", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INITIAL_WINDOW_SIZE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Setting", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "INITIAL_WINDOW_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAX_FRAME_SIZE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Setting", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "MAX_FRAME_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAX_HEADER_LIST_SIZE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Setting", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "MAX_HEADER_LIST_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/Setting", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "UNKNOWN", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/Setting");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "HEADER_TABLE_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "ENABLE_PUSH", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "MAX_CONCURRENT_STREAMS", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "INITIAL_WINDOW_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "MAX_FRAME_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "MAX_HEADER_LIST_SIZE", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Setting", "UNKNOWN", "Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/Setting", "$VALUES", "[Lorg/apache/coyote/http2/Setting;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
