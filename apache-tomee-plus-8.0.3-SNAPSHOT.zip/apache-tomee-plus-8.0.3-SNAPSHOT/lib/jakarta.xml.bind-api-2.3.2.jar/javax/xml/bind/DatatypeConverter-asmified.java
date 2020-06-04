package asm.javax.xml.bind;
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
public class DatatypeConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "javax/xml/bind/DatatypeConverter", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SET_DATATYPE_CONVERTER_PERMISSION", "Ljavax/xml/bind/JAXBPermission;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setDatatypeConverter", "(Ljavax/xml/bind/DatatypeConverterInterface;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DatatypeConverter.ConverterMustNotBeNull");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/Messages", "format", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "SET_DATATYPE_CONVERTER_PERMISSION", "Ljavax/xml/bind/JAXBPermission;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/SecurityManager", "checkPermission", "(Ljava/security/Permission;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/SecurityManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNCHRONIZED, "initConverter", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/DatatypeConverterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/DatatypeConverterImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseString", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseString", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseInteger", "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseInteger", "(Ljava/lang/String;)Ljava/math/BigInteger;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseInt", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseInt", "(Ljava/lang/String;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseLong", "(Ljava/lang/String;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseLong", "(Ljava/lang/String;)J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseShort", "(Ljava/lang/String;)S", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseShort", "(Ljava/lang/String;)S", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseDecimal", "(Ljava/lang/String;)Ljava/math/BigDecimal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseDecimal", "(Ljava/lang/String;)Ljava/math/BigDecimal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseFloat", "(Ljava/lang/String;)F", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseFloat", "(Ljava/lang/String;)F", true);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseDouble", "(Ljava/lang/String;)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseDouble", "(Ljava/lang/String;)D", true);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseBoolean", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseBoolean", "(Ljava/lang/String;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseByte", "(Ljava/lang/String;)B", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseByte", "(Ljava/lang/String;)B", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseQName", "(Ljava/lang/String;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseQName", "(Ljava/lang/String;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/namespace/QName;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseDateTime", "(Ljava/lang/String;)Ljava/util/Calendar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseDateTime", "(Ljava/lang/String;)Ljava/util/Calendar;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseBase64Binary", "(Ljava/lang/String;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseBase64Binary", "(Ljava/lang/String;)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseHexBinary", "(Ljava/lang/String;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseHexBinary", "(Ljava/lang/String;)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseUnsignedInt", "(Ljava/lang/String;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseUnsignedInt", "(Ljava/lang/String;)J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseUnsignedShort", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseUnsignedShort", "(Ljava/lang/String;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseTime", "(Ljava/lang/String;)Ljava/util/Calendar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseTime", "(Ljava/lang/String;)Ljava/util/Calendar;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseDate", "(Ljava/lang/String;)Ljava/util/Calendar;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseDate", "(Ljava/lang/String;)Ljava/util/Calendar;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseAnySimpleType", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "parseAnySimpleType", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printString", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printString", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printInteger", "(Ljava/math/BigInteger;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printInteger", "(Ljava/math/BigInteger;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printInt", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printInt", "(I)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printLong", "(J)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printLong", "(J)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printShort", "(S)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printShort", "(S)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printDecimal", "(Ljava/math/BigDecimal;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printDecimal", "(Ljava/math/BigDecimal;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printFloat", "(F)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(FLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printFloat", "(F)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printDouble", "(D)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(DLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printDouble", "(D)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printBoolean", "(Z)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printBoolean", "(Z)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printByte", "(B)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printByte", "(B)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printQName", "(Ljavax/xml/namespace/QName;Ljavax/xml/namespace/NamespaceContext;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printQName", "(Ljavax/xml/namespace/QName;Ljavax/xml/namespace/NamespaceContext;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printDateTime", "(Ljava/util/Calendar;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printDateTime", "(Ljava/util/Calendar;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printBase64Binary", "([B)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printBase64Binary", "([B)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printHexBinary", "([B)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printHexBinary", "([B)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printUnsignedInt", "(J)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printUnsignedInt", "(J)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printUnsignedShort", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printUnsignedShort", "(I)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printTime", "(Ljava/util/Calendar;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printTime", "(Ljava/util/Calendar;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printDate", "(Ljava/util/Calendar;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printDate", "(Ljava/util/Calendar;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "printAnySimpleType", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/DatatypeConverter", "initConverter", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/DatatypeConverterInterface", "printAnySimpleType", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/xml/bind/DatatypeConverter", "theConverter", "Ljavax/xml/bind/DatatypeConverterInterface;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBPermission");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("setDatatypeConverter");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBPermission", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/xml/bind/DatatypeConverter", "SET_DATATYPE_CONVERTER_PERMISSION", "Ljavax/xml/bind/JAXBPermission;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
