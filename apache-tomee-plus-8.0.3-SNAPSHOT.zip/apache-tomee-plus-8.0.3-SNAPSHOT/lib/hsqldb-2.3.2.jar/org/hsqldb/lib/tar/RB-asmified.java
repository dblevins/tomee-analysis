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
public class RBDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/hsqldb/lib/tar/RB", "Ljava/lang/Enum<Lorg/hsqldb/lib/tar/RB;>;Lorg/hsqldb/lib/RefCapableRBInterface;", "java/lang/Enum", new String[] { "org/hsqldb/lib/RefCapableRBInterface" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DbBackup_syntax", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DbBackup_syntaxerr", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TarGenerator_syntax", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "pad_block_write", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "cleanup_rmfail", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TarReader_syntax", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "unsupported_entry_present", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "bpr_write", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "stream_buffer_report", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "write_queue_report", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "file_missing", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "modified_property", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "file_disappeared", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "file_changed", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "file_appeared", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "pif_malformat", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "pif_malformat_size", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "zero_write", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "pif_toobig", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "read_denied", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "compression_unknown", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "insufficient_read", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "decompression_ranout", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "move_work_file", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "cant_overwrite", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "cant_write_dir", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "no_parent_dir", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "bad_block_write_len", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "illegal_block_boundary", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "workfile_delete_fail", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "unsupported_ext", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "dest_exists", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "parent_not_dir", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "cant_write_parent", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "parent_create_fail", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "tar_field_toobig", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "missing_supp_path", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "nonfile_entry", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "read_lt_1", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "data_changed", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "unexpected_header_key", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "tarreader_syntaxerr", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "unsupported_mode", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "dir_x_conflict", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "pif_unknown_datasize", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "pif_data_toobig", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "data_size_unknown", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "extraction_exists", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "extraction_exists_notfile", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "extraction_parent_not_dir", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "extraction_parent_not_writable", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "extraction_parent_mkfail", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "write_count_mismatch", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "header_field_missing", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "checksum_mismatch", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "create_only_normal", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "bad_header_value", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "bad_numeric_header_value", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "listing_format", "Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/hsqldb/lib/tar/RB;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/hsqldb/lib/tar/RB;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "$VALUES", "[Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/hsqldb/lib/tar/RB;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/hsqldb/lib/tar/RB;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/hsqldb/lib/tar/RB;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/lib/tar/RB");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/lib/ValidatingResourceBundle", "resourceKeyFor", "(Ljava/lang/Enum;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpandedString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getExpandedString", "(Ljava/lang/Enum;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getExpandedString", "([Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getExpandedString", "(Ljava/lang/Enum;[Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getString", "([Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;[Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(II)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;II)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(III)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;III)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(ILjava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;ILjava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(Ljava/lang/String;I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;Ljava/lang/String;I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(IILjava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;IILjava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(ILjava/lang/String;I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;ILjava/lang/String;I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(Ljava/lang/String;II)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;Ljava/lang/String;II)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "getString", "(Ljava/lang/Enum;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DbBackup_syntax");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "DbBackup_syntax", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DbBackup_syntaxerr");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "DbBackup_syntaxerr", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TarGenerator_syntax");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "TarGenerator_syntax", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pad_block_write");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "pad_block_write", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cleanup_rmfail");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "cleanup_rmfail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TarReader_syntax");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "TarReader_syntax", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unsupported_entry_present");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "unsupported_entry_present", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("bpr_write");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "bpr_write", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("stream_buffer_report");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "stream_buffer_report", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("write_queue_report");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "write_queue_report", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("file_missing");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "file_missing", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("modified_property");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "modified_property", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("file_disappeared");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "file_disappeared", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("file_changed");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "file_changed", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("file_appeared");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "file_appeared", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pif_malformat");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "pif_malformat", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pif_malformat_size");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "pif_malformat_size", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("zero_write");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "zero_write", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pif_toobig");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "pif_toobig", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("read_denied");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "read_denied", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("compression_unknown");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "compression_unknown", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("insufficient_read");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "insufficient_read", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("decompression_ranout");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "decompression_ranout", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("move_work_file");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "move_work_file", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cant_overwrite");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "cant_overwrite", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cant_write_dir");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "cant_write_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("no_parent_dir");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "no_parent_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("bad_block_write_len");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "bad_block_write_len", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("illegal_block_boundary");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "illegal_block_boundary", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("workfile_delete_fail");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "workfile_delete_fail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unsupported_ext");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "unsupported_ext", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dest_exists");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "dest_exists", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("parent_not_dir");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "parent_not_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cant_write_parent");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "cant_write_parent", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("parent_create_fail");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "parent_create_fail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("tar_field_toobig");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "tar_field_toobig", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("missing_supp_path");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "missing_supp_path", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("nonfile_entry");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "nonfile_entry", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("read_lt_1");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "read_lt_1", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("data_changed");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "data_changed", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unexpected_header_key");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "unexpected_header_key", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("tarreader_syntaxerr");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "tarreader_syntaxerr", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unsupported_mode");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "unsupported_mode", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dir_x_conflict");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "dir_x_conflict", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pif_unknown_datasize");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "pif_unknown_datasize", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pif_data_toobig");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "pif_data_toobig", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("data_size_unknown");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "data_size_unknown", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("extraction_exists");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "extraction_exists", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("extraction_exists_notfile");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "extraction_exists_notfile", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("extraction_parent_not_dir");
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "extraction_parent_not_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("extraction_parent_not_writable");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "extraction_parent_not_writable", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("extraction_parent_mkfail");
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "extraction_parent_mkfail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("write_count_mismatch");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "write_count_mismatch", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("header_field_missing");
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "header_field_missing", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("checksum_mismatch");
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "checksum_mismatch", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("create_only_normal");
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "create_only_normal", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("bad_header_value");
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "bad_header_value", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("bad_numeric_header_value");
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "bad_numeric_header_value", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("listing_format");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/tar/RB", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "listing_format", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/hsqldb/lib/tar/RB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "DbBackup_syntax", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "DbBackup_syntaxerr", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "TarGenerator_syntax", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "pad_block_write", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "cleanup_rmfail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "TarReader_syntax", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "unsupported_entry_present", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "bpr_write", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "stream_buffer_report", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "write_queue_report", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "file_missing", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "modified_property", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "file_disappeared", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "file_changed", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "file_appeared", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "pif_malformat", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "pif_malformat_size", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "zero_write", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "pif_toobig", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "read_denied", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "compression_unknown", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "insufficient_read", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "decompression_ranout", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "move_work_file", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "cant_overwrite", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "cant_write_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "no_parent_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "bad_block_write_len", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "illegal_block_boundary", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "workfile_delete_fail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "unsupported_ext", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "dest_exists", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "parent_not_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "cant_write_parent", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "parent_create_fail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "tar_field_toobig", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "missing_supp_path", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "nonfile_entry", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "read_lt_1", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "data_changed", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "unexpected_header_key", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "tarreader_syntaxerr", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "unsupported_mode", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "dir_x_conflict", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "pif_unknown_datasize", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "pif_data_toobig", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "data_size_unknown", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "extraction_exists", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "extraction_exists_notfile", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "extraction_parent_not_dir", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "extraction_parent_not_writable", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "extraction_parent_mkfail", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "write_count_mismatch", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "header_field_missing", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "checksum_mismatch", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "create_only_normal", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "bad_header_value", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "bad_numeric_header_value", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "listing_format", "Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "$VALUES", "[Lorg/hsqldb/lib/tar/RB;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/ValidatingResourceBundle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/hsqldb/lib/tar/RB;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getPackage", "()Ljava/lang/Package;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Package", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".rb");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/hsqldb/lib/tar/RB;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/ValidatingResourceBundle", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "setMissingPosValueBehavior", "(I)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/lib/tar/RB", "vrb", "Lorg/hsqldb/lib/ValidatingResourceBundle;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/ValidatingResourceBundle", "setMissingPropertyBehavior", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
