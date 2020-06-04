package asm.com.sun.faces.config.manager;
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
public class DbfFactory$FacesSchemaDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "Ljava/lang/Enum<Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/config/manager/DbfFactory$FacesSchema", "com/sun/faces/config/manager/DbfFactory", "FacesSchema", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACES_20", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACES_21", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACES_22", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACES_23", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACES_12", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACES_11", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELET_TAGLIB_20", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELET_TAGLIB_22", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "$VALUES", "[Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
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
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACES_20");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_20", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACES_21");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_21", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACES_22");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_22", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACES_23");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_23", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACES_12");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_12", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACES_11");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_11", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELET_TAGLIB_20");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACELET_TAGLIB_20", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELET_TAGLIB_22");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACELET_TAGLIB_22", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/config/manager/DbfFactory$FacesSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_20", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_21", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_22", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_23", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_12", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACES_11", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACELET_TAGLIB_20", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "FACELET_TAGLIB_22", "Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/manager/DbfFactory$FacesSchema", "$VALUES", "[Lcom/sun/faces/config/manager/DbfFactory$FacesSchema;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
