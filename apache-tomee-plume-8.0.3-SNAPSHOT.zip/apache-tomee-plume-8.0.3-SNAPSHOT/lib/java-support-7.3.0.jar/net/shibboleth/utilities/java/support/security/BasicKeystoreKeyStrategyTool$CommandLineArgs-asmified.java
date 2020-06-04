package asm.net.shibboleth.utilities.java.support.security;
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
public class BasicKeystoreKeyStrategyTool$CommandLineArgsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", null, "java/lang/Object", null);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$FileConverter", "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool", "FileConverter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool", "CommandLineArgs", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$1", "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool", null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HELP", "Ljava/lang/String;", null, "--help");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_TYPE", "Ljava/lang/String;", null, "--type");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_SIZE", "Ljava/lang/String;", null, "--size");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_ALIAS", "Ljava/lang/String;", null, "--alias");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_COUNT", "Ljava/lang/String;", null, "--count");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STORE_TYPE", "Ljava/lang/String;", null, "--storetype");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STORE_FILE", "Ljava/lang/String;", null, "--storefile");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STORE_PASS", "Ljava/lang/String;", null, "--storepass");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERSION_FILE", "Ljava/lang/String;", null, "--versionfile");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "help", "Z", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--help");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Display program usage");
annotationVisitor0.visit("help", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyType", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--type");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Type of key to generate (default: AES)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keySize", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--size");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Size of key to generate (default: 128)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/Positive;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyAlias", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--alias");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visit("description", "Base name of key alias");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyCount", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--count");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Number of keys to maintain (default: 30)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/Positive;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keystoreType", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--storetype");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Type of keystore to generate (default: JCEKS)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keystoreFile", "Ljava/io/File;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--storefile");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visit("converter", Type.getType("Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$FileConverter;"));
annotationVisitor0.visit("description", "Path to keystore");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keystorePassword", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--storepass");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visit("description", "Password for keystore");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "versionFile", "Ljava/io/File;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--versionfile");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visit("converter", Type.getType("Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$FileConverter;"));
annotationVisitor0.visit("description", "Path to key versioning file");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyType", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keySize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("JCEKS");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keySize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$302", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyAlias", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$402", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyCount", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$502", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$602", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;Ljava/io/File;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keystoreFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$702", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keystorePassword", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$802", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;Ljava/io/File;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "versionFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keystoreFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keystorePassword", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "versionFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyAlias", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keySize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "keyCount", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lnet/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/BasicKeystoreKeyStrategyTool$CommandLineArgs", "help", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
