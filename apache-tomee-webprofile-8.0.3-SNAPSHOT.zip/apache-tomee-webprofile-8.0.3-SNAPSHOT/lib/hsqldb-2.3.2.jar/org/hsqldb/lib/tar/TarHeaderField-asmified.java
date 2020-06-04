package asm.org.hsqldb.lib.tar;
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
public class TarHeaderFieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/hsqldb/lib/tar/TarHeaderField", "Ljava/lang/Enum<Lorg/hsqldb/lib/tar/TarHeaderField;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "name", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "mode", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "uid", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "gid", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "size", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "mtime", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "checksum", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "typeflag", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "magic", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "uname", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "gname", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "prefix", "Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "start", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stop", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "$VALUES", "[Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/hsqldb/lib/tar/TarHeaderField;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/hsqldb/lib/tar/TarHeaderField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/hsqldb/lib/tar/TarHeaderField;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;III)V", "(II)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/lib/tar/TarHeaderField", "start", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/lib/tar/TarHeaderField", "stop", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStart", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/lib/tar/TarHeaderField", "start", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStop", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/lib/tar/TarHeaderField", "stop", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "name", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("mode");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "mode", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("uid");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "uid", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("gid");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "gid", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("size");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitIntInsn(SIPUSH, 135);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "size", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("mtime");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(SIPUSH, 136);
methodVisitor.visitIntInsn(SIPUSH, 147);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "mtime", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("checksum");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(SIPUSH, 148);
methodVisitor.visitIntInsn(SIPUSH, 156);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "checksum", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("typeflag");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(SIPUSH, 156);
methodVisitor.visitIntInsn(SIPUSH, 157);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "typeflag", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("magic");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(SIPUSH, 257);
methodVisitor.visitIntInsn(SIPUSH, 263);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "magic", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("uname");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(SIPUSH, 265);
methodVisitor.visitIntInsn(SIPUSH, 296);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "uname", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("gname");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(SIPUSH, 297);
methodVisitor.visitIntInsn(SIPUSH, 328);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "gname", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("prefix");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(SIPUSH, 345);
methodVisitor.visitIntInsn(SIPUSH, 399);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/TarHeaderField", "<init>", "(Ljava/lang/String;III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "prefix", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/lib/tar/TarHeaderField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "name", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "mode", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "uid", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "gid", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "size", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "mtime", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "checksum", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "typeflag", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "magic", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "uname", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "gname", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "prefix", "Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/TarHeaderField", "$VALUES", "[Lorg/hsqldb/lib/tar/TarHeaderField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
