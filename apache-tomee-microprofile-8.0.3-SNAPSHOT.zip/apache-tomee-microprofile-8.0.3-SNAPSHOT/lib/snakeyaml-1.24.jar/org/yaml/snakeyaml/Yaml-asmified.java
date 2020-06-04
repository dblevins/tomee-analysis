package asm.org.yaml.snakeyaml;
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
public class YamlDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/yaml/snakeyaml/Yaml", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/yaml/snakeyaml/Yaml$EventIterable", "org/yaml/snakeyaml/Yaml", "EventIterable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/Yaml$NodeIterable", "org/yaml/snakeyaml/Yaml", "NodeIterable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/Yaml$YamlIterable", "org/yaml/snakeyaml/Yaml", "YamlIterable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/Yaml$SilentEmitter", "org/yaml/snakeyaml/Yaml", "SilentEmitter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/Yaml$3", null, null, 0);

classWriter.visitInnerClass("org/yaml/snakeyaml/Yaml$2", null, null, 0);

classWriter.visitInnerClass("org/yaml/snakeyaml/Yaml$1", null, null, 0);

classWriter.visitInnerClass("org/yaml/snakeyaml/DumperOptions$FlowStyle", "org/yaml/snakeyaml/DumperOptions", "FlowStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/yaml/snakeyaml/DumperOptions$ScalarStyle", "org/yaml/snakeyaml/DumperOptions", "ScalarStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "representer", "Lorg/yaml/snakeyaml/representer/Representer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dumperOptions", "Lorg/yaml/snakeyaml/DumperOptions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "loadingConfig", "Lorg/yaml/snakeyaml/LoaderOptions;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/constructor/Constructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/constructor/Constructor", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/Representer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/Representer", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/LoaderOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/LoaderOptions", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/resolver/Resolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/resolver/Resolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/DumperOptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/constructor/Constructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/constructor/Constructor", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/Representer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/Representer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/LoaderOptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/constructor/Constructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/constructor/Constructor", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/Representer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/Representer", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/representer/Representer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/constructor/Constructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/constructor/Constructor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/Representer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/Representer", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/Yaml", "initDumperOptions", "(Lorg/yaml/snakeyaml/representer/Representer;)Lorg/yaml/snakeyaml/DumperOptions;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "initDumperOptions", "(Lorg/yaml/snakeyaml/representer/Representer;)Lorg/yaml/snakeyaml/DumperOptions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getDefaultFlowStyle", "()Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "setDefaultFlowStyle", "(Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getDefaultScalarStyle", "()Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "setDefaultScalarStyle", "(Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getPropertyUtils", "()Lorg/yaml/snakeyaml/introspector/PropertyUtils;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/introspector/PropertyUtils", "isAllowReadOnlyProperties", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "setAllowReadOnlyProperties", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getTimeZone", "()Ljava/util/TimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "setTimeZone", "(Ljava/util/TimeZone;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/constructor/Constructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/constructor/Constructor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/LoaderOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/LoaderOptions", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/resolver/Resolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/resolver/Resolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/LoaderOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/LoaderOptions", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/resolver/Resolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/resolver/Resolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/resolver/Resolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/resolver/Resolver", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/resolver/Resolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/LoaderOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/LoaderOptions", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/constructor/BaseConstructor;Lorg/yaml/snakeyaml/representer/Representer;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/LoaderOptions;Lorg/yaml/snakeyaml/resolver/Resolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "isExplicitPropertyUtils", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getPropertyUtils", "()Lorg/yaml/snakeyaml/introspector/PropertyUtils;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "setPropertyUtils", "(Lorg/yaml/snakeyaml/introspector/PropertyUtils;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/yaml/snakeyaml/Yaml", "org/yaml/snakeyaml/constructor/BaseConstructor", "org/yaml/snakeyaml/representer/Representer", "org/yaml/snakeyaml/DumperOptions", "org/yaml/snakeyaml/LoaderOptions", "org/yaml/snakeyaml/resolver/Resolver"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "isExplicitPropertyUtils", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "getPropertyUtils", "()Lorg/yaml/snakeyaml/introspector/PropertyUtils;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "setPropertyUtils", "(Lorg/yaml/snakeyaml/introspector/PropertyUtils;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/LoaderOptions", "isAllowDuplicateKeys", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "setAllowDuplicateKeys", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/LoaderOptions", "isWrappedToRootException", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "setWrappedToRootException", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "getIndent", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "getIndicatorIndent", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label2);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/error/YAMLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Indicator indent must be smaller then indent.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/error/YAMLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "getDefaultFlowStyle", "()Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "setDefaultFlowStyle", "(Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "getDefaultScalarStyle", "()Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "setDefaultScalarStyle", "(Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getPropertyUtils", "()Lorg/yaml/snakeyaml/introspector/PropertyUtils;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "isAllowReadOnlyProperties", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/introspector/PropertyUtils", "setAllowReadOnlyProperties", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions", "getTimeZone", "()Ljava/util/TimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "setTimeZone", "(Ljava/util/TimeZone;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/Yaml", "dumperOptions", "Lorg/yaml/snakeyaml/DumperOptions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/Yaml", "loadingConfig", "Lorg/yaml/snakeyaml/LoaderOptions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Yaml:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/Yaml", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dump", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/Yaml", "dumpAll", "(Ljava/util/Iterator;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "represent", "(Ljava/lang/Object;)Lorg/yaml/snakeyaml/nodes/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "represent", "(Ljava/lang/Object;)Lorg/yaml/snakeyaml/nodes/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dumpAll", "(Ljava/util/Iterator;)Ljava/lang/String;", "(Ljava/util/Iterator<+Ljava/lang/Object;>;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/StringWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/StringWriter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "dumpAll", "(Ljava/util/Iterator;Ljava/io/Writer;Lorg/yaml/snakeyaml/nodes/Tag;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/StringWriter", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dump", "(Ljava/lang/Object;Ljava/io/Writer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "dumpAll", "(Ljava/util/Iterator;Ljava/io/Writer;Lorg/yaml/snakeyaml/nodes/Tag;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dumpAll", "(Ljava/util/Iterator;Ljava/io/Writer;)V", "(Ljava/util/Iterator<+Ljava/lang/Object;>;Ljava/io/Writer;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "dumpAll", "(Ljava/util/Iterator;Ljava/io/Writer;Lorg/yaml/snakeyaml/nodes/Tag;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "dumpAll", "(Ljava/util/Iterator;Ljava/io/Writer;Lorg/yaml/snakeyaml/nodes/Tag;)V", "(Ljava/util/Iterator<+Ljava/lang/Object;>;Ljava/io/Writer;Lorg/yaml/snakeyaml/nodes/Tag;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/serializer/Serializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/emitter/Emitter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "dumperOptions", "Lorg/yaml/snakeyaml/DumperOptions;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/emitter/Emitter", "<init>", "(Ljava/io/Writer;Lorg/yaml/snakeyaml/DumperOptions;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "dumperOptions", "Lorg/yaml/snakeyaml/DumperOptions;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/serializer/Serializer", "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitable;Lorg/yaml/snakeyaml/resolver/Resolver;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/nodes/Tag;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/serializer/Serializer", "open", "()V", false);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/yaml/snakeyaml/serializer/Serializer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "represent", "(Ljava/lang/Object;)Lorg/yaml/snakeyaml/nodes/Node;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/serializer/Serializer", "serialize", "(Lorg/yaml/snakeyaml/nodes/Node;)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/serializer/Serializer", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/error/YAMLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/error/YAMLException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dumpAs", "(Ljava/lang/Object;Lorg/yaml/snakeyaml/nodes/Tag;Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getDefaultFlowStyle", "()Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "setDefaultFlowStyle", "(Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/yaml/snakeyaml/DumperOptions$FlowStyle"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "java/io/StringWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/StringWriter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "dumpAll", "(Ljava/util/Iterator;Ljava/io/Writer;Lorg/yaml/snakeyaml/nodes/Tag;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "setDefaultFlowStyle", "(Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/StringWriter", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dumpAsMap", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/nodes/Tag", "MAP", "Lorg/yaml/snakeyaml/nodes/Tag;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$FlowStyle", "BLOCK", "Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/Yaml", "dumpAs", "(Ljava/lang/Object;Lorg/yaml/snakeyaml/nodes/Tag;Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serialize", "(Lorg/yaml/snakeyaml/nodes/Node;)Ljava/util/List;", "(Lorg/yaml/snakeyaml/nodes/Node;)Ljava/util/List<Lorg/yaml/snakeyaml/events/Event;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/Yaml$SilentEmitter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml$SilentEmitter", "<init>", "(Lorg/yaml/snakeyaml/Yaml$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/serializer/Serializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "dumperOptions", "Lorg/yaml/snakeyaml/DumperOptions;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/serializer/Serializer", "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitable;Lorg/yaml/snakeyaml/resolver/Resolver;Lorg/yaml/snakeyaml/DumperOptions;Lorg/yaml/snakeyaml/nodes/Tag;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/serializer/Serializer", "open", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/serializer/Serializer", "serialize", "(Lorg/yaml/snakeyaml/nodes/Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/serializer/Serializer", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/yaml/snakeyaml/Yaml", "org/yaml/snakeyaml/nodes/Node", "org/yaml/snakeyaml/Yaml$SilentEmitter", "org/yaml/snakeyaml/serializer/Serializer"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/error/YAMLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/error/YAMLException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/Yaml$SilentEmitter", "getEvents", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljava/lang/String;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "loadFromReader", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljava/io/InputStream;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/InputStream;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/UnicodeReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/UnicodeReader", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "loadFromReader", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljava/io/Reader;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/Reader;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "loadFromReader", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadAs", "(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/Reader;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "loadFromReader", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadAs", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "loadFromReader", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadAs", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/InputStream;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/UnicodeReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/UnicodeReader", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml", "loadFromReader", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "loadFromReader", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class;)Ljava/lang/Object;", "(Lorg/yaml/snakeyaml/reader/StreamReader;Ljava/lang/Class<*>;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/composer/Composer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl", "<init>", "(Lorg/yaml/snakeyaml/reader/StreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/composer/Composer", "<init>", "(Lorg/yaml/snakeyaml/parser/Parser;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "setComposer", "(Lorg/yaml/snakeyaml/composer/Composer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "getSingleData", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadAll", "(Ljava/io/Reader;)Ljava/lang/Iterable;", "(Ljava/io/Reader;)Ljava/lang/Iterable<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/composer/Composer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl", "<init>", "(Lorg/yaml/snakeyaml/reader/StreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/composer/Composer", "<init>", "(Lorg/yaml/snakeyaml/parser/Parser;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "setComposer", "(Lorg/yaml/snakeyaml/composer/Composer;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/Yaml$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml$1", "<init>", "(Lorg/yaml/snakeyaml/Yaml;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/Yaml$YamlIterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml$YamlIterable", "<init>", "(Ljava/util/Iterator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadAll", "(Ljava/lang/String;)Ljava/lang/Iterable;", "(Ljava/lang/String;)Ljava/lang/Iterable<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/StringReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/StringReader", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/Yaml", "loadAll", "(Ljava/io/Reader;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadAll", "(Ljava/io/InputStream;)Ljava/lang/Iterable;", "(Ljava/io/InputStream;)Ljava/lang/Iterable<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/UnicodeReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/UnicodeReader", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/Yaml", "loadAll", "(Ljava/io/Reader;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compose", "(Ljava/io/Reader;)Lorg/yaml/snakeyaml/nodes/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/composer/Composer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl", "<init>", "(Lorg/yaml/snakeyaml/reader/StreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/composer/Composer", "<init>", "(Lorg/yaml/snakeyaml/parser/Parser;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/composer/Composer", "getSingleNode", "()Lorg/yaml/snakeyaml/nodes/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "composeAll", "(Ljava/io/Reader;)Ljava/lang/Iterable;", "(Ljava/io/Reader;)Ljava/lang/Iterable<Lorg/yaml/snakeyaml/nodes/Node;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/composer/Composer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl", "<init>", "(Lorg/yaml/snakeyaml/reader/StreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/composer/Composer", "<init>", "(Lorg/yaml/snakeyaml/parser/Parser;Lorg/yaml/snakeyaml/resolver/Resolver;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/Yaml$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml$2", "<init>", "(Lorg/yaml/snakeyaml/Yaml;Lorg/yaml/snakeyaml/composer/Composer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/Yaml$NodeIterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml$NodeIterable", "<init>", "(Ljava/util/Iterator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addImplicitResolver", "(Lorg/yaml/snakeyaml/nodes/Tag;Ljava/util/regex/Pattern;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "resolver", "Lorg/yaml/snakeyaml/resolver/Resolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/resolver/Resolver", "addImplicitResolver", "(Lorg/yaml/snakeyaml/nodes/Tag;Ljava/util/regex/Pattern;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/Yaml", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/Reader;)Ljava/lang/Iterable;", "(Ljava/io/Reader;)Ljava/lang/Iterable<Lorg/yaml/snakeyaml/events/Event;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/reader/StreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/reader/StreamReader", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl", "<init>", "(Lorg/yaml/snakeyaml/reader/StreamReader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/Yaml$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml$3", "<init>", "(Lorg/yaml/snakeyaml/Yaml;Lorg/yaml/snakeyaml/parser/Parser;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/Yaml$EventIterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/Yaml$EventIterable", "<init>", "(Ljava/util/Iterator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBeanAccess", "(Lorg/yaml/snakeyaml/introspector/BeanAccess;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "getPropertyUtils", "()Lorg/yaml/snakeyaml/introspector/PropertyUtils;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/introspector/PropertyUtils", "setBeanAccess", "(Lorg/yaml/snakeyaml/introspector/BeanAccess;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "getPropertyUtils", "()Lorg/yaml/snakeyaml/introspector/PropertyUtils;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/introspector/PropertyUtils", "setBeanAccess", "(Lorg/yaml/snakeyaml/introspector/BeanAccess;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addTypeDescription", "(Lorg/yaml/snakeyaml/TypeDescription;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "constructor", "Lorg/yaml/snakeyaml/constructor/BaseConstructor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/constructor/BaseConstructor", "addTypeDescription", "(Lorg/yaml/snakeyaml/TypeDescription;)Lorg/yaml/snakeyaml/TypeDescription;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/Yaml", "representer", "Lorg/yaml/snakeyaml/representer/Representer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/Representer", "addTypeDescription", "(Lorg/yaml/snakeyaml/TypeDescription;)Lorg/yaml/snakeyaml/TypeDescription;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
