package asm.com.fasterxml.jackson.databind.cfg;
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
public class MapperConfigBaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "<CFG::Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;T:Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;>Lcom/fasterxml/jackson/databind/cfg/MapperConfig<TT;>;Ljava/io/Serializable;", "com/fasterxml/jackson/databind/cfg/MapperConfig", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonInclude$Value", "com/fasterxml/jackson/annotation/JsonInclude", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Value", "com/fasterxml/jackson/annotation/JsonFormat", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonIgnoreProperties$Value", "com/fasterxml/jackson/annotation/JsonIgnoreProperties", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonSetter$Value", "com/fasterxml/jackson/annotation/JsonSetter", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver", "com/fasterxml/jackson/databind/introspect/ClassIntrospector", "MixInResolver", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility", "com/fasterxml/jackson/annotation/JsonAutoDetect", "Visibility", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonAutoDetect$Value", "com/fasterxml/jackson/annotation/JsonAutoDetect", "Value", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "EMPTY_OVERRIDE", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_MAPPER_FEATURES", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "AUTO_DETECT_MASK", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_view", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;Lcom/fasterxml/jackson/databind/util/RootNameLookup;Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "DEFAULT_MAPPER_FEATURES", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/cfg/ContextAttributes", "getEmpty", "()Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;Lcom/fasterxml/jackson/databind/util/RootNameLookup;Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;Lcom/fasterxml/jackson/databind/util/RootNameLookup;Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "copy", "()Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;I)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Lcom/fasterxml/jackson/databind/PropertyName;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;Lcom/fasterxml/jackson/databind/PropertyName;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Ljava/lang/Class;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)V", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase<TCFG;TT;>;Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperConfig", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "_withMapperFeatures", "(I)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(I)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_VARARGS, "with", "([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "([Lcom/fasterxml/jackson/databind/MapperFeature;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/MapperConfigBase", "[Lcom/fasterxml/jackson/databind/MapperFeature;", Opcodes.INTEGER, "[Lcom/fasterxml/jackson/databind/MapperFeature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withMapperFeatures", "(I)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_VARARGS, "without", "([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "([Lcom/fasterxml/jackson/databind/MapperFeature;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/fasterxml/jackson/databind/cfg/MapperConfigBase", "[Lcom/fasterxml/jackson/databind/MapperFeature;", Opcodes.INTEGER, "[Lcom/fasterxml/jackson/databind/MapperFeature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withMapperFeatures", "(I)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/databind/MapperFeature;Z)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/MapperFeature;Z)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withMapperFeatures", "(I)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "withAppendedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withAppendedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "withInsertedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withInsertedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withClassIntrospector", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "with", "(Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withAttributes", "(Ljava/util/Map;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/util/Map<**>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getAttributes", "()Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ContextAttributes", "withSharedAttributes", "(Ljava/util/Map;)Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "with", "(Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withAttribute", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/lang/Object;Ljava/lang/Object;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getAttributes", "()Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ContextAttributes", "withSharedAttribute", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "with", "(Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withoutAttribute", "(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/lang/Object;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getAttributes", "()Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ContextAttributes", "withoutSharedAttribute", "(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "with", "(Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/type/TypeFactory;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withTypeFactory", "(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder<*>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withTypeResolverBuilder", "(Lcom/fasterxml/jackson/databind/jsontype/TypeResolverBuilder;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withPropertyNamingStrategy", "(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withHandlerInstantiator", "(Lcom/fasterxml/jackson/databind/cfg/HandlerInstantiator;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Lcom/fasterxml/jackson/core/Base64Variant;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/core/Base64Variant;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "with", "(Lcom/fasterxml/jackson/core/Base64Variant;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Ljava/text/DateFormat;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/text/DateFormat;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "withDateFormat", "(Ljava/text/DateFormat;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Ljava/util/Locale;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/util/Locale;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "with", "(Ljava/util/Locale;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "with", "(Ljava/util/TimeZone;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/util/TimeZone;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_base", "Lcom/fasterxml/jackson/databind/cfg/BaseSettings;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/BaseSettings", "with", "(Ljava/util/TimeZone;)Lcom/fasterxml/jackson/databind/cfg/BaseSettings;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_withBase", "(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withRootName", "(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/PropertyName;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withRootName", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/lang/String;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/PropertyName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "withRootName", "(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/PropertyName", "construct", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "withRootName", "(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "with", "(Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withView", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", "(Ljava/lang/Class<*>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getSubtypeResolver", "()Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_subtypeResolver", "Lcom/fasterxml/jackson/databind/jsontype/SubtypeResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_DEPRECATED, "getRootName", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/PropertyName", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getFullRootName", "()Lcom/fasterxml/jackson/databind/PropertyName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getActiveView", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_view", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAttributes", "()Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_attributes", "Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getConfigOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", "(Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "findOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "EMPTY_OVERRIDE", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/cfg/ConfigOverride"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/databind/cfg/ConfigOverride"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "findConfigOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", "(Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "findOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultPropertyInclusion", "()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "getDefaultInclusion", "()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultPropertyInclusion", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", "(Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getConfigOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "getInclude", "()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getDefaultPropertyInclusion", "()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/fasterxml/jackson/annotation/JsonInclude$Value", "com/fasterxml/jackson/annotation/JsonInclude$Value"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/annotation/JsonInclude$Value", "withOverrides", "(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultInclusion", "(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", "(Ljava/lang/Class<*>;Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getConfigOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "getIncludeAsProperty", "()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getDefaultPropertyInclusion", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/fasterxml/jackson/annotation/JsonInclude$Value", "com/fasterxml/jackson/annotation/JsonInclude$Value"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/annotation/JsonInclude$Value", "withOverrides", "(Lcom/fasterxml/jackson/annotation/JsonInclude$Value;)Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultPropertyFormat", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;", "(Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "findFormatDefaults", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultPropertyIgnorals", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", "(Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "findOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "getIgnorals", "()Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/cfg/ConfigOverride"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultPropertyIgnorals", "(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", "(Ljava/lang/Class<*>;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getAnnotationIntrospector", "()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/AnnotationIntrospector"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/AnnotationIntrospector", "findPropertyIgnorals", "(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/annotation/JsonIgnoreProperties$Value"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getDefaultPropertyIgnorals", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/annotation/JsonIgnoreProperties$Value", "merge", "(Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;)Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultVisibilityChecker", "()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", "()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "getDefaultVisibility", "()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mapperFeatures", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "AUTO_DETECT_MASK", "I");
methodVisitor.visitInsn(IAND);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "AUTO_DETECT_MASK", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_FIELDS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "isEnabled", "(Lcom/fasterxml/jackson/databind/MapperFeature;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility", "NONE", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/introspect/VisibilityChecker", "withFieldVisibility", "(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/introspect/VisibilityChecker"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "isEnabled", "(Lcom/fasterxml/jackson/databind/MapperFeature;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility", "NONE", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/introspect/VisibilityChecker", "withGetterVisibility", "(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_IS_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "isEnabled", "(Lcom/fasterxml/jackson/databind/MapperFeature;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility", "NONE", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/introspect/VisibilityChecker", "withIsGetterVisibility", "(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "isEnabled", "(Lcom/fasterxml/jackson/databind/MapperFeature;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility", "NONE", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/introspect/VisibilityChecker", "withSetterVisibility", "(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_CREATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "isEnabled", "(Lcom/fasterxml/jackson/databind/MapperFeature;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility", "NONE", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/introspect/VisibilityChecker", "withCreatorVisibility", "(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultVisibilityChecker", "(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", "(Ljava/lang/Class<*>;Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getDefaultVisibilityChecker", "()Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "getAnnotationIntrospector", "()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/AnnotationIntrospector", "findAutoDetectVisibility", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedClass;Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/fasterxml/jackson/databind/introspect/VisibilityChecker", "com/fasterxml/jackson/databind/AnnotationIntrospector"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "findOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "getVisibility", "()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/introspect/VisibilityChecker", "withOverrides", "(Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;)Lcom/fasterxml/jackson/databind/introspect/VisibilityChecker;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/cfg/ConfigOverride"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDefaultSetterInfo", "()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "getDefaultSetterInfo", "()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultMergeable", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "getDefaultMergeable", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultMergeable", "(Ljava/lang/Class;)Ljava/lang/Boolean;", "(Ljava/lang/Class<*>;)Ljava/lang/Boolean;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "findOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "getMergeable", "()Ljava/lang/Boolean;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "com/fasterxml/jackson/databind/cfg/ConfigOverride"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_configOverrides", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverrides;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/ConfigOverrides", "getDefaultMergeable", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findRootName", "(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/PropertyName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/util/RootNameLookup", "findRootName", "(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)Lcom/fasterxml/jackson/databind/PropertyName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findRootName", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/PropertyName;", "(Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/databind/PropertyName;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootName", "Lcom/fasterxml/jackson/databind/PropertyName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_rootNames", "Lcom/fasterxml/jackson/databind/util/RootNameLookup;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/util/RootNameLookup", "findRootName", "(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/cfg/MapperConfig;)Lcom/fasterxml/jackson/databind/PropertyName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "findMixInClassFor", "(Ljava/lang/Class;)Ljava/lang/Class;", "(Ljava/lang/Class<*>;)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/SimpleMixInResolver", "findMixInClassFor", "(Ljava/lang/Class;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector$MixInResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "mixInCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "_mixIns", "Lcom/fasterxml/jackson/databind/introspect/SimpleMixInResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/SimpleMixInResolver", "localSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "with", "(Lcom/fasterxml/jackson/databind/MapperFeature;Z)Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "with", "(Lcom/fasterxml/jackson/databind/MapperFeature;Z)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "without", "([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "without", "([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "with", "([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "with", "([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "empty", "()Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "EMPTY_OVERRIDE", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/MapperFeature;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "collectFeatureDefaults", "(Ljava/lang/Class;)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "DEFAULT_MAPPER_FEATURES", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_FIELDS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_IS_GETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_SETTERS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/MapperFeature", "AUTO_DETECT_CREATORS", "Lcom/fasterxml/jackson/databind/MapperFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/MapperFeature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/cfg/MapperConfigBase", "AUTO_DETECT_MASK", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
