package asm.org.apache.bval.jsr;
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
public class ApacheValidatorFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/ApacheValidatorFactory", null, "java/lang/Object", new String[] { "javax/validation/ValidatorFactory", "java/lang/Cloneable" });

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privilizing;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/apache/commons/weaver/privilizer/Privilizing$CallTo;");
annotationVisitor2.visit("value", Type.getType("Lorg/apache/bval/util/reflection/Reflection;"));
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privilized;", false);
annotationVisitor0.visit("value", "DYNAMIC");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/weaver/privilizer/Privilizing$CallTo", "org/apache/commons/weaver/privilizer/Privilizing", "CallTo", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/valueextraction/ValueExtractors$OnDuplicateContainerElementKey", "org/apache/bval/jsr/valueextraction/ValueExtractors", "OnDuplicateContainerElementKey", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass$$Ljava_lang_Class$_ACTION", "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass$$Ljava_lang_Class$_ACTION", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$ZLjava_lang_ClassLoader$_ACTION", "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$ZLjava_lang_ClassLoader$_ACTION", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$_ACTION", "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$_ACTION", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$newInstance$$Ljava_lang_Class$_ACTION", "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$newInstance$$Ljava_lang_Class$_ACTION", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "DEFAULT_FACTORY", "Lorg/apache/bval/jsr/ApacheValidatorFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "properties", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotationsManager", "Lorg/apache/bval/jsr/util/AnnotationsManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "descriptorManager", "Lorg/apache/bval/jsr/descriptor/DescriptorManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "metadataBuilders", "Lorg/apache/bval/jsr/metadata/MetadataBuilders;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "constraintsCache", "Lorg/apache/bval/jsr/ConstraintCached;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "unwrappedClassCache", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Class<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "toClose", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/io/Closeable;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "groupsComputer", "Lorg/apache/bval/jsr/groups/GroupsComputer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "participantFactory", "Lorg/apache/bval/jsr/ParticipantFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "valueExtractors", "Lorg/apache/bval/jsr/valueextraction/ValueExtractors;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "messageResolver", "Ljavax/validation/MessageInterpolator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "traversableResolver", "Ljavax/validation/TraversableResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "constraintValidatorFactory", "Ljavax/validation/ConstraintValidatorFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameterNameProvider", "Ljavax/validation/ParameterNameProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "clockProvider", "Ljavax/validation/ClockProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefault", "()Lorg/apache/bval/jsr/ApacheValidatorFactory;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "DEFAULT_FACTORY", "Lorg/apache/bval/jsr/ApacheValidatorFactory;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/ApacheValidatorFactory;"));
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "DEFAULT_FACTORY", "Lorg/apache/bval/jsr/ApacheValidatorFactory;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/ApacheValidationProvider;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/validation/Validation", "byProvider", "(Ljava/lang/Class;)Ljavax/validation/bootstrap/ProviderSpecificBootstrap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/bootstrap/ProviderSpecificBootstrap", "configure", "()Ljavax/validation/Configuration;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/ApacheValidatorConfiguration");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/ApacheValidatorConfiguration", "buildValidatorFactory", "()Ljavax/validation/ValidatorFactory;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/ApacheValidatorFactory;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/ApacheValidatorFactory");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "DEFAULT_FACTORY", "Lorg/apache/bval/jsr/ApacheValidatorFactory;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "DEFAULT_FACTORY", "Lorg/apache/bval/jsr/ApacheValidatorFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setDefault", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "DEFAULT_FACTORY", "Lorg/apache/bval/jsr/ApacheValidatorFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "createBaseValueExtractors", "(Lorg/apache/bval/jsr/ParticipantFactory;)Lorg/apache/bval/jsr/valueextraction/ValueExtractors;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/valueextraction/ValueExtractors");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/valueextraction/ValueExtractors$OnDuplicateContainerElementKey", "OVERWRITE", "Lorg/apache/bval/jsr/valueextraction/ValueExtractors$OnDuplicateContainerElementKey;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/valueextraction/ValueExtractors", "<init>", "(Lorg/apache/bval/jsr/valueextraction/ValueExtractors$OnDuplicateContainerElementKey;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/valueextraction/ValueExtractor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ParticipantFactory", "loadServices", "(Ljava/lang/Class;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/valueextraction/ValueExtractors;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/valueextraction/ValueExtractors", "add", "(Ljavax/validation/valueextraction/ValueExtractor;)V", false), Type.getType("(Ljavax/validation/valueextraction/ValueExtractor;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/validation/spi/ConfigurationState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/DescriptorManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/DescriptorManager", "<init>", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "descriptorManager", "Lorg/apache/bval/jsr/descriptor/DescriptorManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/MetadataBuilders");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/MetadataBuilders", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "metadataBuilders", "Lorg/apache/bval/jsr/metadata/MetadataBuilders;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintCached");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintCached", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "constraintsCache", "Lorg/apache/bval/jsr/ConstraintCached;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "unwrappedClassCache", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "toClose", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/groups/GroupsComputer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/groups/GroupsComputer", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "groupsComputer", "Lorg/apache/bval/jsr/groups/GroupsComputer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ConfigurationState", "getProperties", "()Ljava/util/Map;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "properties", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ConfigurationState", "getParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "parameterNameProvider", "Ljavax/validation/ParameterNameProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ConfigurationState", "getMessageInterpolator", "()Ljavax/validation/MessageInterpolator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "messageResolver", "Ljavax/validation/MessageInterpolator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ConfigurationState", "getTraversableResolver", "()Ljavax/validation/TraversableResolver;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "traversableResolver", "Ljavax/validation/TraversableResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ConfigurationState", "getConstraintValidatorFactory", "()Ljavax/validation/ConstraintValidatorFactory;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "constraintValidatorFactory", "Ljavax/validation/ConstraintValidatorFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ConfigurationState", "getClockProvider", "()Ljavax/validation/ClockProvider;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "clockProvider", "Ljavax/validation/ClockProvider;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/bval/util/CloseableAble");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "toClose", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/util/CloseableAble");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/util/CloseableAble", "getCloseable", "()Ljava/io/Closeable;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/bval/jsr/ApacheValidatorFactory", "javax/validation/spi/ConfigurationState"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ParticipantFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/ClassLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/ApacheValidatorFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ParticipantFactory", "<init>", "([Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "participantFactory", "Lorg/apache/bval/jsr/ParticipantFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "toClose", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "participantFactory", "Lorg/apache/bval/jsr/ParticipantFactory;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "participantFactory", "Lorg/apache/bval/jsr/ParticipantFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "createBaseValueExtractors", "(Lorg/apache/bval/jsr/ParticipantFactory;)Lorg/apache/bval/jsr/valueextraction/ValueExtractors;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/valueextraction/ValueExtractors", "createChild", "()Lorg/apache/bval/jsr/valueextraction/ValueExtractors;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "valueExtractors", "Lorg/apache/bval/jsr/valueextraction/ValueExtractors;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ConfigurationState", "getValueExtractors", "()Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "valueExtractors", "Lorg/apache/bval/jsr/valueextraction/ValueExtractors;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/valueextraction/ValueExtractors;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/valueextraction/ValueExtractors", "add", "(Ljavax/validation/valueextraction/ValueExtractor;)V", false), Type.getType("(Ljavax/validation/valueextraction/ValueExtractor;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/AnnotationsManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/AnnotationsManager", "<init>", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "annotationsManager", "Lorg/apache/bval/jsr/util/AnnotationsManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory", "loadAndVerifyUserCustomizations", "(Ljavax/validation/spi/ConfigurationState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnwrappedClassCache", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "unwrappedClassCache", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperties", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "properties", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidator", "()Ljavax/validation/Validator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "usingContext", "()Lorg/apache/bval/jsr/ApacheFactoryContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheFactoryContext", "getValidator", "()Ljavax/validation/Validator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "usingContext", "()Lorg/apache/bval/jsr/ApacheFactoryContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ApacheFactoryContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheFactoryContext", "<init>", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "clone", "()Lorg/apache/bval/jsr/ApacheValidatorFactory;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/CloneNotSupportedException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/ApacheValidatorFactory");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/CloneNotSupportedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/InternalError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/InternalError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setMessageInterpolator", "(Ljavax/validation/MessageInterpolator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "messageResolver", "Ljavax/validation/MessageInterpolator;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageInterpolator", "()Ljavax/validation/MessageInterpolator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "messageResolver", "Ljavax/validation/MessageInterpolator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setTraversableResolver", "(Ljavax/validation/TraversableResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "traversableResolver", "Ljavax/validation/TraversableResolver;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParameterNameProvider", "(Ljavax/validation/ParameterNameProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "parameterNameProvider", "Ljavax/validation/ParameterNameProvider;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClockProvider", "(Ljavax/validation/ClockProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "clockProvider", "Ljavax/validation/ClockProvider;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTraversableResolver", "()Ljavax/validation/TraversableResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "traversableResolver", "Ljavax/validation/TraversableResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setConstraintValidatorFactory", "(Ljavax/validation/ConstraintValidatorFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "constraintValidatorFactory", "Ljavax/validation/ConstraintValidatorFactory;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/DefaultConstraintValidatorFactory;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "toClose", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/io/Closeable;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstraintValidatorFactory", "()Ljavax/validation/ConstraintValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "constraintValidatorFactory", "Ljavax/validation/ConstraintValidatorFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "parameterNameProvider", "Ljavax/validation/ParameterNameProvider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClockProvider", "()Ljavax/validation/ClockProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "clockProvider", "Ljavax/validation/ClockProvider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "toClose", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/Closeable");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/Closeable", "close", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "toClose", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "clear", "()V", true);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/bval/jsr/ApacheValidatorFactory"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInterface", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isAbstract", "(I)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory", "newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("Impl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory", "newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/bval/jsr/ApacheValidatorFactory", "java/lang/Class"}, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/validation/ValidationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Type ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" not supported");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/ValidationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "org_apache_bval_util_reflection_Reflection$$lambda$loaderFromThreadOrClass$1", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "(Ljava/lang/Class<*>;)Ljava/lang/ClassLoader;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privileged;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass$$Ljava_lang_Class$_ACTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass$$Ljava_lang_Class$_ACTION", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "__privileged_access$0", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "__privileged_org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "(Ljava/lang/Class<*>;)Ljava/lang/ClassLoader;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "of", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false), Type.getType("(Ljava/lang/Thread;)Ljava/lang/ClassLoader;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Ljava/lang/Class;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$lambda$loaderFromThreadOrClass$1", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", false), Type.getType("()Ljava/lang/ClassLoader;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElseGet", "(Ljava/util/function/Supplier;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privileged;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/security/PrivilegedActionException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$ZLjava_lang_ClassLoader$_ACTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$ZLjava_lang_ClassLoader$_ACTION", "<init>", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "__privileged_access$1", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Field");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/BitSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/BitSet", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/util/reflection/Reflection;"));
methodVisitor.visitLdcInsn("NATIVE_CODES");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getDeclaredField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(SWAP);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(SWAP);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "isAccessible", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "set", "(I)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/lang/String", Opcodes.INTEGER, "java/lang/ClassLoader", "[Ljava/lang/reflect/Field;", "java/util/BitSet", Opcodes.INTEGER}, 1, new Object[] {"java/lang/reflect/Field"});
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "setAccessible", "(Z)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("className was null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("[]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(NOP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Field");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitInsn(NOP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Field");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNE, label9);
methodVisitor.visitInsn(NOP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Field");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label11);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "get", "(I)Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNE, label12);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "setAccessible", "(Z)V", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(NOP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Field");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFLE, label13);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label14 = new Label();
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/StringBuilder", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label15);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNE, label16);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNE, label17);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label18);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label19 = new Label();
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label20);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "get", "(I)Z", false);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNE, label21);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "setAccessible", "(Z)V", false);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/lang/String", Opcodes.INTEGER, "java/lang/ClassLoader", "[Ljava/lang/reflect/Field;", "java/util/BitSet", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label22 = new Label();
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
Label label23 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label23);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "get", "(I)Z", false);
Label label24 = new Label();
methodVisitor.visitJumpInsn(IFNE, label24);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "setAccessible", "(Z)V", false);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privileged;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/security/PrivilegedActionException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", "<init>", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "__privileged_access$2", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/String;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privileged;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/security/PrivilegedActionException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$_ACTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$_ACTION", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "__privileged_access$3", "(Ljava/lang/String;)Ljava/lang/Class;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/String;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/util/reflection/Reflection;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$loaderFromThreadOrClass", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$toClass", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/RuntimeException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "org_apache_bval_util_reflection_Reflection$$newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/validation/ValidationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/RuntimeException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/ValidationException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "org_apache_bval_util_reflection_Reflection$$newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privileged;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$newInstance$$Ljava_lang_Class$_ACTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$newInstance$$Ljava_lang_Class$_ACTION", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "__privileged_access$4", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_org_apache_bval_util_reflection_Reflection$$newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "__privileged_org_apache_bval_util_reflection_Reflection$$newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot instantiate : ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstraintsCache", "()Lorg/apache/bval/jsr/ConstraintCached;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "constraintsCache", "Lorg/apache/bval/jsr/ConstraintCached;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationsManager", "()Lorg/apache/bval/jsr/util/AnnotationsManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "annotationsManager", "Lorg/apache/bval/jsr/util/AnnotationsManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescriptorManager", "()Lorg/apache/bval/jsr/descriptor/DescriptorManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "descriptorManager", "Lorg/apache/bval/jsr/descriptor/DescriptorManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueExtractors", "()Lorg/apache/bval/jsr/valueextraction/ValueExtractors;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "valueExtractors", "Lorg/apache/bval/jsr/valueextraction/ValueExtractors;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetadataBuilders", "()Lorg/apache/bval/jsr/metadata/MetadataBuilders;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "metadataBuilders", "Lorg/apache/bval/jsr/metadata/MetadataBuilders;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGroupsComputer", "()Lorg/apache/bval/jsr/groups/GroupsComputer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "groupsComputer", "Lorg/apache/bval/jsr/groups/GroupsComputer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "loadAndVerifyUserCustomizations", "(Ljavax/validation/spi/ConfigurationState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory", "lambda$loadAndVerifyUserCustomizations$0", "(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)V", false), Type.getType("(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)V")});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory", "participantFactory", "Lorg/apache/bval/jsr/ParticipantFactory;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/metadata/MetadataSource;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ParticipantFactory", "loadServices", "(Ljava/lang/Class;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;Ljavax/validation/spi/ConfigurationState;Ljava/util/function/BiConsumer;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/ApacheValidatorFactory", "lambda$loadAndVerifyUserCustomizations$1", "(Ljavax/validation/spi/ConfigurationState;Ljava/util/function/BiConsumer;Lorg/apache/bval/jsr/metadata/MetadataSource;)V", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataSource;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "clone", "()Lorg/apache/bval/jsr/ApacheValidatorFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "usingContext", "()Ljavax/validation/ValidatorContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "usingContext", "()Lorg/apache/bval/jsr/ApacheFactoryContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$loadAndVerifyUserCustomizations$1", "(Ljavax/validation/spi/ConfigurationState;Ljava/util/function/BiConsumer;Lorg/apache/bval/jsr/metadata/MetadataSource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataSource", "initialize", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "getConstraintsCache", "()Lorg/apache/bval/jsr/ConstraintCached;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/ConstraintCached;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintCached", "add", "(Lorg/apache/bval/jsr/metadata/ValidatorMappingProvider;)V", false), Type.getType("(Lorg/apache/bval/jsr/metadata/ValidatorMappingProvider;)V")});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataSource", "process", "(Ljavax/validation/spi/ConfigurationState;Ljava/util/function/Consumer;Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$loadAndVerifyUserCustomizations$0", "(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "getMetadataBuilders", "()Lorg/apache/bval/jsr/metadata/MetadataBuilders;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/MetadataBuilders", "registerCustomBuilder", "(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
