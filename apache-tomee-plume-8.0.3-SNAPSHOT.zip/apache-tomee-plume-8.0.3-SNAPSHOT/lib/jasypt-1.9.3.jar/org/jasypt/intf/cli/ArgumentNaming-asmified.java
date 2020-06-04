package asm.org.jasypt.intf.cli;
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
public class ArgumentNamingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "org/jasypt/intf/cli/ArgumentNaming", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_VERBOSE", "Ljava/lang/String;", null, "verbose");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_INPUT", "Ljava/lang/String;", null, "input");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_PASSWORD", "Ljava/lang/String;", null, "password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_ALGORITHM", "Ljava/lang/String;", null, "algorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_ITERATIONS", "Ljava/lang/String;", null, "iterations");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_KEY_OBTENTION_ITERATIONS", "Ljava/lang/String;", null, "keyObtentionIterations");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_SALT_SIZE_BYTES", "Ljava/lang/String;", null, "saltSizeBytes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_SALT_GENERATOR_CLASS_NAME", "Ljava/lang/String;", null, "saltGeneratorClassName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_IV_GENERATOR_CLASS_NAME", "Ljava/lang/String;", null, "ivGeneratorClassName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_PROVIDER_CLASS_NAME", "Ljava/lang/String;", null, "providerClassName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_PROVIDER_NAME", "Ljava/lang/String;", null, "providerName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_INVERT_POSITION_OF_SALT_IN_MESSAGE_BEFORE_DIGESTING", "Ljava/lang/String;", null, "invertPositionOfSaltInMessageBeforeDigesting");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_INVERT_POSITION_OF_PLAIN_SALT_IN_ENCRYPTION_RESULTS", "Ljava/lang/String;", null, "invertPositionOfPlainSaltInEncryptionResults");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_USE_LENIENT_SALT_SIZE_CHECK", "Ljava/lang/String;", null, "useLenientSaltSizeCheck");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_UNICODE_NORMALIZATION_IGNORED", "Ljava/lang/String;", null, "unicodeNormalizationIgnored");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_STRING_OUTPUT_TYPE", "Ljava/lang/String;", null, "stringOutputType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_PREFIX", "Ljava/lang/String;", null, "prefix");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ARG_SUFFIX", "Ljava/lang/String;", null, "suffix");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
