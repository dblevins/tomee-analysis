package asm.org.apache.openejb.config.sys;
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
public class SaxAppCtxConfig$SaxAppContextConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", null, "org/apache/openejb/config/sys/StackHandler", null);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "org/apache/openejb/config/sys/SaxAppCtxConfig", "SaxAppContextConfig", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$EnvEntry", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "EnvEntry", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$EnvEntries", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "EnvEntries", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ResourcesConfig", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "ResourcesConfig", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContext", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BeanContext", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojo", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "Pojo", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$BeanContexts", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BeanContexts", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$WebAppContext", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "WebAppContext", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$ModuleContext", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "ModuleContext", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Pojos", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "Pojos", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$MultipleConfiguration", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "MultipleConfiguration", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Configuration", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "Configuration", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Root", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "Root", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Document", "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "Document", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxAppCtxConfig$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "IMPORT_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "APPLICATION_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "POJOS_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "POJO_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BEAN_CONTEXTS_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WEBAPP_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MODULE_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BEAN_CONTEXT_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CONFIGURATION_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "RESOURCES_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SERVICE_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "RESOURCE_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ENV_ENTRIES_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ENV_ENTRY_ALIASES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "module", "Lorg/apache/openejb/config/AppModule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "envEntriesDeployer", "Lorg/apache/openejb/config/EnvEntriesPropertiesDeployer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "beanPropertiesDeployer", "Lorg/apache/openejb/config/BeanProperties;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/config/AppModule;Lorg/apache/openejb/config/EnvEntriesPropertiesDeployer;Lorg/apache/openejb/config/BeanProperties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/StackHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "module", "Lorg/apache/openejb/config/AppModule;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "envEntriesDeployer", "Lorg/apache/openejb/config/EnvEntriesPropertiesDeployer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "beanPropertiesDeployer", "Lorg/apache/openejb/config/BeanProperties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startDocument", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Document");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig$Document", "<init>", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;Lorg/apache/openejb/config/sys/SaxAppCtxConfig$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "push", "(Lorg/xml/sax/helpers/DefaultHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "APPLICATION_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "CONFIGURATION_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;)Lorg/apache/openejb/config/AppModule;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "module", "Lorg/apache/openejb/config/AppModule;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "ENV_ENTRIES_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BEAN_CONTEXTS_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "MODULE_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "WEBAPP_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "POJOS_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1400", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "RESOURCES_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1600", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "IMPORT_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1700", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;)Lorg/apache/openejb/config/EnvEntriesPropertiesDeployer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "envEntriesDeployer", "Lorg/apache/openejb/config/EnvEntriesPropertiesDeployer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1800", "(Lorg/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig;)Lorg/apache/openejb/config/BeanProperties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "beanPropertiesDeployer", "Lorg/apache/openejb/config/BeanProperties;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2000", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "POJO_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2300", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BEAN_CONTEXT_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2400", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "SERVICE_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2500", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "RESOURCE_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2600", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "ENV_ENTRY_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("import");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("include");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "IMPORT_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("appcontext");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("app-context");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("application");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "APPLICATION_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("pojocontexts");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("pojo-contexts");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("pojos");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "POJOS_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("pojo");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "POJO_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("beancontexts");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("bean-contexts");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ejbs");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BEAN_CONTEXTS_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("webapps");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("webcontexts");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("web-contexts");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("wars");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "WEBAPP_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("modulecontext");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("module");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "MODULE_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("ejb");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("beancontext");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("bean-context");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "BEAN_CONTEXT_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("configuration");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("properties");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("settings");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "CONFIGURATION_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("resources");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "RESOURCES_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("service");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "SERVICE_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("resource");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "RESOURCE_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("enventries");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("env-entries");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "ENV_ENTRIES_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("enventry");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("env-entry");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxAppCtxConfig$SaxAppContextConfig", "ENV_ENTRY_ALIASES", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
