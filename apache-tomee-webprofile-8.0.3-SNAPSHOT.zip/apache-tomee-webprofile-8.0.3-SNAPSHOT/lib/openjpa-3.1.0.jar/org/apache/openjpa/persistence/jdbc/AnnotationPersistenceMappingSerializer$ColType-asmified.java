package asm.org.apache.openjpa.persistence.jdbc;
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
public class AnnotationPersistenceMappingSerializer$ColTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer", "ColType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COL", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JOIN", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVERSE", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PK_JOIN", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISC", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType");
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getColumnAnnotationType", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$1", "$SwitchMap$org$apache$openjpa$persistence$jdbc$AnnotationPersistenceMappingSerializer$ColType", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(1, 5, label4, new Label[] { label0, label0, label1, label2, label3 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/Column;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/JoinColumn;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/PrimaryKeyJoinColumn;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/DiscriminatorColumn;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getColumnGroupAnnotationType", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$1", "$SwitchMap$org$apache$openjpa$persistence$jdbc$AnnotationPersistenceMappingSerializer$ColType", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTableSwitchInsn(1, 4, label1, new Label[] { label0, label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/JoinColumns;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/PrimaryKeyJoinColumns;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "getColumnGroupAnnotationType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "getColumnAnnotationType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "COL", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JOIN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "JOIN", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVERSE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "INVERSE", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PK_JOIN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "PK_JOIN", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISC");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "DISC", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "COL", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "JOIN", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "INVERSE", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "PK_JOIN", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "DISC", "Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType", "$VALUES", "[Lorg/apache/openjpa/persistence/jdbc/AnnotationPersistenceMappingSerializer$ColType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
