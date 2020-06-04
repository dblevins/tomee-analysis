package asm.org.eclipse.persistence.internal.sessions;
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
public class PropertiesHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/PropertiesHandler", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$BatchWritingProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "BatchWritingProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$BooleanProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "BooleanProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$CacheSizeProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "CacheSizeProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$CacheTypeProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "CacheTypeProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$CommitOrderProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "CommitOrderProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$ConnectionPoolProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "ConnectionPoolProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$DescriptorCustomizerProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "DescriptorCustomizerProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$ExclusiveConnectionModeProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "ExclusiveConnectionModeProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$FlushClearCacheProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "FlushClearCacheProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$FlushModeProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "FlushModeProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$IdValidationProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "IdValidationProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$LoggerTypeProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "LoggerTypeProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$LoggingLevelProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "LoggingLevelProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "Prop", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$QueryTimeoutUnitProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "QueryTimeoutUnitProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$ReferenceModeProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "ReferenceModeProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$TargetDatabaseProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "TargetDatabaseProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$TargetServerProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "TargetServerProp", ACC_PROTECTED | ACC_STATIC);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyValue", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler", "getPropertyValue", "(Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyValueLogDebug", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler", "getPropertyValueLogDebug", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Z)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyValue", "(Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getPropertyValueToApply", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Z)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyValueLogDebug", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Z)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getPropertyValueToApply", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Z)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getPropertyValueToApply", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyValueLogDebug", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getPropertyValueToApply", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPrefixedPropertyValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler", "getPrefixValues", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPrefixValues", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getPrefixValuesToApply", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Z)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPrefixValuesLogDebug", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getPrefixValuesToApply", "(Ljava/lang/String;Ljava/util/Map;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Z)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultPropertyValue", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getDefaultPropertyValueToApply", "(Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultPropertyValueLogDebug", "(Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "getDefaultPropertyValueToApply", "(Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "shouldUseDefault", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
