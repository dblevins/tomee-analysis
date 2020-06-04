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
public class ConfigOverrideDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/fasterxml/jackson/databind/cfg/ConfigOverride", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/cfg/ConfigOverride$Empty", "com/fasterxml/jackson/databind/cfg/ConfigOverride", "Empty", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Value", "com/fasterxml/jackson/annotation/JsonFormat", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonInclude$Value", "com/fasterxml/jackson/annotation/JsonInclude", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonIgnoreProperties$Value", "com/fasterxml/jackson/annotation/JsonIgnoreProperties", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonSetter$Value", "com/fasterxml/jackson/annotation/JsonSetter", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonAutoDetect$Value", "com/fasterxml/jackson/annotation/JsonAutoDetect", "Value", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_format", "Lcom/fasterxml/jackson/annotation/JsonFormat$Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_include", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_includeAsProperty", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_ignorals", "Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_setterInfo", "Lcom/fasterxml/jackson/annotation/JsonSetter$Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_visibility", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_isIgnoredType", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_mergeable", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_format", "Lcom/fasterxml/jackson/annotation/JsonFormat$Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_format", "Lcom/fasterxml/jackson/annotation/JsonFormat$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_include", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_include", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_includeAsProperty", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_includeAsProperty", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_ignorals", "Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_ignorals", "Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_setterInfo", "Lcom/fasterxml/jackson/annotation/JsonSetter$Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_setterInfo", "Lcom/fasterxml/jackson/annotation/JsonSetter$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_visibility", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_visibility", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_isIgnoredType", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_isIgnoredType", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_mergeable", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_mergeable", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "empty", "()Lcom/fasterxml/jackson/databind/cfg/ConfigOverride;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/cfg/ConfigOverride$Empty", "INSTANCE", "Lcom/fasterxml/jackson/databind/cfg/ConfigOverride$Empty;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFormat", "()Lcom/fasterxml/jackson/annotation/JsonFormat$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_format", "Lcom/fasterxml/jackson/annotation/JsonFormat$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInclude", "()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_include", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIncludeAsProperty", "()Lcom/fasterxml/jackson/annotation/JsonInclude$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_includeAsProperty", "Lcom/fasterxml/jackson/annotation/JsonInclude$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIgnorals", "()Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_ignorals", "Lcom/fasterxml/jackson/annotation/JsonIgnoreProperties$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIsIgnoredType", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_isIgnoredType", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSetterInfo", "()Lcom/fasterxml/jackson/annotation/JsonSetter$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_setterInfo", "Lcom/fasterxml/jackson/annotation/JsonSetter$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVisibility", "()Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_visibility", "Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMergeable", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/cfg/ConfigOverride", "_mergeable", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
