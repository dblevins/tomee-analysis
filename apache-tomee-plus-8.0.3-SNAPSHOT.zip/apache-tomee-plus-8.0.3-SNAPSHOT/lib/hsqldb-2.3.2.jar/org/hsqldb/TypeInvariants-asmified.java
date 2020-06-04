package asm.org.hsqldb;
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
public class TypeInvariantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/TypeInvariants", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$HsqlName", "org/hsqldb/HsqlNameManager", "HsqlName", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CARDINAL_NUMBER", "Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "YES_OR_NO", "Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER_DATA", "Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQL_IDENTIFIER", "Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME_STAMP", "Lorg/hsqldb/types/Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("CARDINAL_NUMBER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlNameManager", "newInfoSchemaObjectName", "(Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/NumberType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/NumberType", "<init>", "(IJI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/TypeInvariants", "CARDINAL_NUMBER", "Lorg/hsqldb/types/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "CARDINAL_NUMBER", "Lorg/hsqldb/types/Type;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/UserTypeModifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "CARDINAL_NUMBER", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/UserTypeModifier", "<init>", "(Lorg/hsqldb/HsqlNameManager$HsqlName;ILorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitLdcInsn("YES_OR_NO");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlNameManager", "newInfoSchemaObjectName", "(Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn(new Long(3L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/TypeInvariants", "YES_OR_NO", "Lorg/hsqldb/types/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "YES_OR_NO", "Lorg/hsqldb/types/Type;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/UserTypeModifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "YES_OR_NO", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/UserTypeModifier", "<init>", "(Lorg/hsqldb/HsqlNameManager$HsqlName;ILorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitLdcInsn("CHARACTER_DATA");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlNameManager", "newInfoSchemaObjectName", "(Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn(new Long(65536L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/TypeInvariants", "CHARACTER_DATA", "Lorg/hsqldb/types/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "CHARACTER_DATA", "Lorg/hsqldb/types/Type;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/UserTypeModifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "CHARACTER_DATA", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/UserTypeModifier", "<init>", "(Lorg/hsqldb/HsqlNameManager$HsqlName;ILorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitLdcInsn("SQL_IDENTIFIER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlNameManager", "newInfoSchemaObjectName", "(Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/CharacterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn(new Long(128L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/CharacterType", "<init>", "(IJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/TypeInvariants", "SQL_IDENTIFIER", "Lorg/hsqldb/types/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "SQL_IDENTIFIER", "Lorg/hsqldb/types/Type;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/UserTypeModifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "SQL_IDENTIFIER", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/UserTypeModifier", "<init>", "(Lorg/hsqldb/HsqlNameManager$HsqlName;ILorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitLdcInsn("TIME_STAMP");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlNameManager", "newInfoSchemaObjectName", "(Ljava/lang/String;ZI)Lorg/hsqldb/HsqlNameManager$HsqlName;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/DateTimeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/DateTimeType", "<init>", "(III)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/TypeInvariants", "TIME_STAMP", "Lorg/hsqldb/types/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "TIME_STAMP", "Lorg/hsqldb/types/Type;");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/UserTypeModifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/TypeInvariants", "TIME_STAMP", "Lorg/hsqldb/types/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/UserTypeModifier", "<init>", "(Lorg/hsqldb/HsqlNameManager$HsqlName;ILorg/hsqldb/types/Type;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/types/Type", "userTypeModifier", "Lorg/hsqldb/types/UserTypeModifier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
