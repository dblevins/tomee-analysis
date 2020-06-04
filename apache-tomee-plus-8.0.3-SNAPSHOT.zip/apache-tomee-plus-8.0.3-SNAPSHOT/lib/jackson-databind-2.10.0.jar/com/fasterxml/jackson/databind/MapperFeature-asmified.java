package asm.com.fasterxml.jackson.databind;
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
public class MapperFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/databind/MapperFeature", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/MapperFeature;>;Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;", "java/lang/Enum", new String[] { "com/fasterxml/jackson/databind/cfg/ConfigFeature" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_ANNOTATIONS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_GETTERS_AS_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROPAGATE_TRANSIENT_MARKER", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTO_DETECT_CREATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTO_DETECT_FIELDS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTO_DETECT_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTO_DETECT_IS_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTO_DETECT_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRE_SETTERS_FOR_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_FINAL_FIELDS_AS_MUTATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INFER_PROPERTY_MUTATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CAN_OVERRIDE_ACCESS_MODIFIERS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OVERRIDE_PUBLIC_ACCESS_MODIFIERS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_STATIC_TYPING", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_BASE_TYPE_AS_DEFAULT_IMPL", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT_VIEW_INCLUSION", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SORT_PROPERTIES_ALPHABETICALLY", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_CASE_INSENSITIVE_PROPERTIES", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_CASE_INSENSITIVE_ENUMS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_CASE_INSENSITIVE_VALUES", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_WRAPPER_NAME_AS_PROPERTY_NAME", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_STD_BEAN_NAMING", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_EXPLICIT_PROPERTY_RENAMING", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_COERCION_OF_SCALARS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IGNORE_DUPLICATE_MODULE_REGISTRATIONS", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IGNORE_MERGE_FOR_UNMERGEABLE", "Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_defaultState", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_mask", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "$VALUES", "[Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/MapperFeature;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/MapperFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/MapperFeature;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZ)V", "(Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/MapperFeature", "_defaultState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "ordinal", "()I", false);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/MapperFeature", "_mask", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledByDefault", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/MapperFeature", "_defaultState", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMask", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/MapperFeature", "_mask", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledIn", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/MapperFeature", "_mask", "I");
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_ANNOTATIONS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_ANNOTATIONS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_GETTERS_AS_SETTERS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_GETTERS_AS_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROPAGATE_TRANSIENT_MARKER");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "PROPAGATE_TRANSIENT_MARKER", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTO_DETECT_CREATORS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_CREATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTO_DETECT_FIELDS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_FIELDS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTO_DETECT_GETTERS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTO_DETECT_IS_GETTERS");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_IS_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTO_DETECT_SETTERS");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRE_SETTERS_FOR_GETTERS");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "REQUIRE_SETTERS_FOR_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_FINAL_FIELDS_AS_MUTATORS");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ALLOW_FINAL_FIELDS_AS_MUTATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INFER_PROPERTY_MUTATORS");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "INFER_PROPERTY_MUTATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CAN_OVERRIDE_ACCESS_MODIFIERS");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "CAN_OVERRIDE_ACCESS_MODIFIERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OVERRIDE_PUBLIC_ACCESS_MODIFIERS");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "OVERRIDE_PUBLIC_ACCESS_MODIFIERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_STATIC_TYPING");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_STATIC_TYPING", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_BASE_TYPE_AS_DEFAULT_IMPL");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_BASE_TYPE_AS_DEFAULT_IMPL", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT_VIEW_INCLUSION");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "DEFAULT_VIEW_INCLUSION", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SORT_PROPERTIES_ALPHABETICALLY");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "SORT_PROPERTIES_ALPHABETICALLY", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_CASE_INSENSITIVE_PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ACCEPT_CASE_INSENSITIVE_PROPERTIES", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_CASE_INSENSITIVE_ENUMS");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ACCEPT_CASE_INSENSITIVE_ENUMS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_CASE_INSENSITIVE_VALUES");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ACCEPT_CASE_INSENSITIVE_VALUES", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_WRAPPER_NAME_AS_PROPERTY_NAME");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_WRAPPER_NAME_AS_PROPERTY_NAME", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_STD_BEAN_NAMING");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_STD_BEAN_NAMING", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_EXPLICIT_PROPERTY_RENAMING");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ALLOW_EXPLICIT_PROPERTY_RENAMING", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_COERCION_OF_SCALARS");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ALLOW_COERCION_OF_SCALARS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IGNORE_DUPLICATE_MODULE_REGISTRATIONS");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "IGNORE_DUPLICATE_MODULE_REGISTRATIONS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IGNORE_MERGE_FOR_UNMERGEABLE");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/MapperFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "IGNORE_MERGE_FOR_UNMERGEABLE", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/MapperFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_ANNOTATIONS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_GETTERS_AS_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "PROPAGATE_TRANSIENT_MARKER", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_CREATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_FIELDS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_IS_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "REQUIRE_SETTERS_FOR_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ALLOW_FINAL_FIELDS_AS_MUTATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "INFER_PROPERTY_MUTATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "CAN_OVERRIDE_ACCESS_MODIFIERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "OVERRIDE_PUBLIC_ACCESS_MODIFIERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_STATIC_TYPING", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_BASE_TYPE_AS_DEFAULT_IMPL", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "DEFAULT_VIEW_INCLUSION", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "SORT_PROPERTIES_ALPHABETICALLY", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ACCEPT_CASE_INSENSITIVE_PROPERTIES", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ACCEPT_CASE_INSENSITIVE_ENUMS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ACCEPT_CASE_INSENSITIVE_VALUES", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_WRAPPER_NAME_AS_PROPERTY_NAME", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "USE_STD_BEAN_NAMING", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ALLOW_EXPLICIT_PROPERTY_RENAMING", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "ALLOW_COERCION_OF_SCALARS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "IGNORE_DUPLICATE_MODULE_REGISTRATIONS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "IGNORE_MERGE_FOR_UNMERGEABLE", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "$VALUES", "[Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
