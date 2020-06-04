package asm.com.sun.xml.bind.v2.schemagen;
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
public class GroupKindDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/bind/v2/schemagen/GroupKind", "Ljava/lang/Enum<Lcom/sun/xml/bind/v2/schemagen/GroupKind;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALL", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SEQUENCE", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CHOICE", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/xml/bind/v2/schemagen/GroupKind;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/xml/bind/v2/schemagen/GroupKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "$VALUES", "[Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/xml/bind/v2/schemagen/GroupKind;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/GroupKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/schemagen/GroupKind;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/schemagen/GroupKind");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/GroupKind", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "write", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/Particle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/GroupKind", "name", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/schemagen/xmlschema/Particle;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer", "_element", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/sun/xml/txw2/TypedXmlWriter;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/schemagen/xmlschema/Particle");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/schemagen/GroupKind");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("all");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/GroupKind", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "ALL", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/schemagen/GroupKind");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEQUENCE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("sequence");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/GroupKind", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "SEQUENCE", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/schemagen/GroupKind");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CHOICE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("choice");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/GroupKind", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "CHOICE", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/bind/v2/schemagen/GroupKind");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "ALL", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "SEQUENCE", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "CHOICE", "Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/schemagen/GroupKind", "$VALUES", "[Lcom/sun/xml/bind/v2/schemagen/GroupKind;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
