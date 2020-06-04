package asm.org.apache.openejb.config;
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
public class DeploymentsResolver$ClasspathSearcherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "org/apache/openejb/config/DeploymentsResolver", "ClasspathSearcher", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "include", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "exclude", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "filterSystemApps", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "requireDescriptors", "Ljava/util/Set;", "Ljava/util/Set<Lorg/apache/openejb/config/RequireDescriptors;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "filterDescriptors", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "urlSet", "Lorg/apache/xbean/finder/UrlSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "prefiltered", "Lorg/apache/xbean/finder/UrlSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "urls", "Ljava/util/List;", "Ljava/util/List<Ljava/net/URL;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getOptions", "()Lorg/apache/openejb/loader/Options;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("openejb.deployments.classpath.include");
methodVisitor.visitLdcInsn(".*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/Options", "get", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "include", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("openejb.deployments.classpath.exclude");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/Options", "get", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "exclude", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("openejb.deployments.classpath.filter.systemapps");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/Options", "get", "(Ljava/lang/String;Z)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "filterSystemApps", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("openejb.deployments.classpath.require.descriptor");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/config/RequireDescriptors");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/RequireDescriptors", "CLIENT", "Lorg/apache/openejb/config/RequireDescriptors;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/Options", "getAll", "(Ljava/lang/String;[Ljava/lang/Enum;)Ljava/util/Set;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "requireDescriptors", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("openejb.deployments.classpath.filter.descriptors");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/Options", "get", "(Ljava/lang/String;Z)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "filterDescriptors", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUrls", "()Ljava/util/List;", "()Ljava/util/List<Ljava/net/URL;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urls", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "cleanUpUrlSet", "(Lorg/apache/xbean/finder/UrlSet;)Lorg/apache/xbean/finder/UrlSet;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/MalformedURLException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "size", "()I", false);
methodVisitor.visitInsn(ICONST_5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "getUrls", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "getUrls", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("file");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "getProtocol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/net/URL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("jar:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("!/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URL", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/net/URL"}, 0, null);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/net/MalformedURLException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/UrlSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/UrlSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadUrls", "(Ljava/lang/ClassLoader;)Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/UrlSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/UrlSet", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "cleanUpUrlSet", "(Lorg/apache/xbean/finder/UrlSet;)Lorg/apache/xbean/finder/UrlSet;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/URLs", "cullSystemJars", "(Lorg/apache/xbean/finder/UrlSet;)Lorg/apache/xbean/finder/UrlSet;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "prefiltered", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "include", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/filter/Filters", "patterns", "([Ljava/lang/String;)Lorg/apache/xbean/finder/filter/Filter;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn(".*");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "include", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "exclude", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/xbean/finder/UrlSet", "org/apache/xbean/finder/filter/Filter"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/DeploymentsResolver", "access$800", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("include");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/filter/IncludeExcludeFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "exclude", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/filter/Filters", "patterns", "([Ljava/lang/String;)Lorg/apache/xbean/finder/filter/Filter;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/filter/IncludeExcludeFilter", "<init>", "(Lorg/apache/xbean/finder/filter/Filter;Lorg/apache/xbean/finder/filter/Filter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/filter/ExcludeIncludeFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "exclude", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/filter/Filters", "patterns", "([Ljava/lang/String;)Lorg/apache/xbean/finder/filter/Filter;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/filter/ExcludeIncludeFilter", "<init>", "(Lorg/apache/xbean/finder/filter/Filter;Lorg/apache/xbean/finder/filter/Filter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xbean/finder/filter/Filter"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "filter", "(Lorg/apache/xbean/finder/filter/Filter;)Lorg/apache/xbean/finder/UrlSet;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "prefiltered", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "size", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "size", "()I", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/NewLoaderLogic", "applyBuiltinExcludes", "(Lorg/apache/xbean/finder/UrlSet;Lorg/apache/xbean/finder/filter/Filter;)Lorg/apache/xbean/finder/UrlSet;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "filterSystemApps", "Z");
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitLdcInsn(".*/openejb-[^/]+(.(jar|ear|war)(!/)?|/target/(test-)?classes/?)");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "exclude", "(Ljava/lang/String;)Lorg/apache/xbean/finder/UrlSet;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("os.name");
methodVisitor.visitLdcInsn("unknown");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/JavaSecurityManagers", "getSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "ENGLISH", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "(Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("windows");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn("openejb.resolver.windows.lowercase-urls");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "parseBoolean", "(Ljava/lang/String;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "getUrls", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urls", "Ljava/util/List;");
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urls", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/UrlSet", "getUrls", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label12 = new Label();
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "java/net/URL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URL", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urls", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNE, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urls", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "java/lang/ClassLoader"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/DeploymentsResolver", "access$900", "()Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitLdcInsn("Unable to search classpath");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "warning", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Lorg/apache/xbean/finder/UrlSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "prefiltered", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Lorg/apache/xbean/finder/UrlSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urlSet", "Lorg/apache/xbean/finder/UrlSet;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "urls", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "include", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "exclude", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "filterDescriptors", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "requireDescriptors", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/openejb/config/DeploymentsResolver$ClasspathSearcher;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/DeploymentsResolver$ClasspathSearcher", "filterSystemApps", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
