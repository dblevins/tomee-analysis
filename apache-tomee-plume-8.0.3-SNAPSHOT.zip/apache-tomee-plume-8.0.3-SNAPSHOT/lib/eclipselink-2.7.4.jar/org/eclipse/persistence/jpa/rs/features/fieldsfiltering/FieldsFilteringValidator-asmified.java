package asm.org.eclipse.persistence.jpa.rs.features.fieldsfiltering;
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
public class FieldsFilteringValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIELDS_PARAM_NAME", "Ljava/lang/String;", null, "fields");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCL_FIELDS_PARAM_NAME", "Ljava/lang/String;", null, "excludeFields");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "queryParameters", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "filter", "Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/ws/rs/core/UriInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/rs/resources/common/AbstractResource", "getQueryParameters", "(Ljavax/ws/rs/core/UriInfo;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFeatureApplicable", "()Z", null, new String[] { "org/eclipse/persistence/jpa/rs/exceptions/JPARSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("fields");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("excludeFields");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("fields");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("excludeFields");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/rs/exceptions/JPARSException", "fieldsFilteringBothParametersPresent", "()Lorg/eclipse/persistence/jpa/rs/exceptions/JPARSException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("fields");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilterType", "INCLUDE", "Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilterType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("fields");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter", "<init>", "(Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilterType;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "filter", "Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilterType", "EXCLUDE", "Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilterType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "queryParameters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("excludeFields");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter", "<init>", "(Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilterType;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "filter", "Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFilter", "()Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilteringValidator", "filter", "Lorg/eclipse/persistence/jpa/rs/features/fieldsfiltering/FieldsFilter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
