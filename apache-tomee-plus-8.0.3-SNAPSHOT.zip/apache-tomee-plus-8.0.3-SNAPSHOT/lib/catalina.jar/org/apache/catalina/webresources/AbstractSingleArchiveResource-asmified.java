package asm.org.apache.catalina.webresources;
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
public class AbstractSingleArchiveResourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/catalina/webresources/AbstractSingleArchiveResource", null, "org/apache/catalina/webresources/AbstractArchiveResource", null);

classWriter.visitInnerClass("org/apache/catalina/webresources/AbstractArchiveResource$JarInputStreamWrapper", "org/apache/catalina/webresources/AbstractArchiveResource", "JarInputStreamWrapper", ACC_PROTECTED);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/catalina/webresources/AbstractArchiveResourceSet;Ljava/lang/String;Ljava/lang/String;Ljava/util/jar/JarEntry;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/webresources/AbstractArchiveResource", "<init>", "(Lorg/apache/catalina/webresources/AbstractArchiveResourceSet;Ljava/lang/String;Ljava/lang/String;Ljava/util/jar/JarEntry;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getJarInputStreamWrapper", "()Lorg/apache/catalina/webresources/AbstractArchiveResource$JarInputStreamWrapper;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "getArchiveResourceSet", "()Lorg/apache/catalina/webresources/AbstractArchiveResourceSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractArchiveResourceSet", "openJarFile", "()Ljava/util/jar/JarFile;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "getResource", "()Ljava/util/jar/JarEntry;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarEntry", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "getJarEntry", "(Ljava/lang/String;)Ljava/util/jar/JarEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "getInputStream", "(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/webresources/AbstractArchiveResource$JarInputStreamWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/webresources/AbstractArchiveResource$JarInputStreamWrapper", "<init>", "(Lorg/apache/catalina/webresources/AbstractArchiveResource;Ljava/util/jar/JarEntry;Ljava/io/InputStream;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/catalina/webresources/AbstractSingleArchiveResource", "java/util/jar/JarFile"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "getLog", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "isDebugEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "getLog", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("jarResource.getInputStreamFail");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "getResource", "()Ljava/util/jar/JarEntry;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarEntry", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "getBaseUrl", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "debug", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/IOException"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractSingleArchiveResource", "getArchiveResourceSet", "()Lorg/apache/catalina/webresources/AbstractArchiveResourceSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/webresources/AbstractArchiveResourceSet", "closeJarFile", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
