package asm.org.apache.myfaces.component.validate;
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
public class ValidateWholeBeanComponent$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "Ljava/lang/Enum<Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "org/apache/myfaces/component/validate/ValidateWholeBeanComponent", "PropertyKeys", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "validationGroups", "Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "disabled", "Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("validationGroups");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "validationGroups", "Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("disabled");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "disabled", "Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "validationGroups", "Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "disabled", "Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/component/validate/ValidateWholeBeanComponent$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
