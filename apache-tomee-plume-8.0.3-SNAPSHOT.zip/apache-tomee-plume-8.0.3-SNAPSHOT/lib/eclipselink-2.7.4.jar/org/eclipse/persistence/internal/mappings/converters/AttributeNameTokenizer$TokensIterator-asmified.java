package asm.org.eclipse.persistence.internal.mappings.converters;
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
public class AttributeNameTokenizer$TokensIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "Ljava/lang/Object;Ljava/util/Iterator<Ljava/lang/String;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer", "TokensIterator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PREFIX_PATTERN", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SIMPLE_PATTERN", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NEXT_PATTERN", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "matcher", "Ljava/util/regex/Matcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "prefix", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "token", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("(?:(?<prefix>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix", "KEY", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("|");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix", "VALUE", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(")\\.){0,1}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("([^\\.]+)");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "PREFIX_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitLdcInsn("([^\\.]+)");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "SIMPLE_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitLdcInsn("\\.([^\\.]+)");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "NEXT_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "SIMPLE_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "lookingAt", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "groupCount", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(I)Ljava/lang/String;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String", Opcodes.INTEGER}, 1, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String", Opcodes.INTEGER}, 2, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "prefix", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "PREFIX_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "lookingAt", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitLdcInsn("prefix");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String", Opcodes.INTEGER, "java/lang/String"}, 1, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator"});
methodVisitor.visitLdcInsn("");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String", Opcodes.INTEGER, "java/lang/String"}, 2, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix", "toValue", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "prefix", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "groupCount", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(I)Ljava/lang/String;", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String", Opcodes.INTEGER, "java/lang/String"}, 2, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix", "NULL", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "prefix", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "NEXT_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "usePattern", "(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "end", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "regionEnd", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "region", "(II)Ljava/util/regex/Matcher;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "()Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "prefix", "Lorg/eclipse/persistence/internal/mappings/converters/AttributeNamePrefix;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "lookingAt", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "groupCount", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(I)Ljava/lang/String;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String"}, 1, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String"}, 2, new Object[] {"org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "java/lang/String"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "end", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "matcher", "Ljava/util/regex/Matcher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "regionEnd", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "region", "(II)Ljava/util/regex/Matcher;", false);
methodVisitor.visitInsn(POP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "token", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Removal of attribute name tokens makes no sense");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/mappings/converters/AttributeNameTokenizer$TokensIterator", "next", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
