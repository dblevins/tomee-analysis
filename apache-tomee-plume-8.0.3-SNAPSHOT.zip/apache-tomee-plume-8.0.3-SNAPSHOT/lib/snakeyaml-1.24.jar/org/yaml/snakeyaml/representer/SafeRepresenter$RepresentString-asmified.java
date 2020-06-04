package asm.org.yaml.snakeyaml.representer;
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
public class SafeRepresenter$RepresentStringDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", null, "java/lang/Object", new String[] { "org/yaml/snakeyaml/representer/Represent" });

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentString", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/DumperOptions$ScalarStyle", "org/yaml/snakeyaml/DumperOptions", "ScalarStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "representData", "(Ljava/lang/Object;)Lorg/yaml/snakeyaml/nodes/Node;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/nodes/Tag", "STR", "Lorg/yaml/snakeyaml/nodes/Tag;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/reader/StreamReader", "isPrintable", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/nodes/Tag", "BINARY", "Lorg/yaml/snakeyaml/nodes/Tag;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/error/YAMLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("invalid string value has occurred");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/error/YAMLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "java/lang/Object", "org/yaml/snakeyaml/nodes/Tag", "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "java/lang/String", Opcodes.TOP, "[B", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/external/biz/base64Coder/Base64Coder", "encode", "([B)[C", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "java/lang/Object", "org/yaml/snakeyaml/nodes/Tag", "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "java/lang/String"}, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/error/YAMLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/error/YAMLException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[C"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "([C)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "LITERAL", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "defaultScalarStyle", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "PLAIN", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/representer/SafeRepresenter", "MULTILINE_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "find", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "LITERAL", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/SafeRepresenter", "representScalar", "(Lorg/yaml/snakeyaml/nodes/Tag;Ljava/lang/String;Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;)Lorg/yaml/snakeyaml/nodes/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
