package asm.org.apache.openejb.cdi;
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
public class OpenEJBBeanInfoServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/cdi/OpenEJBBeanInfoService", null, "java/lang/Object", new String[] { "org/apache/webbeans/spi/BeanArchiveService" });

classWriter.visitInnerClass("org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "org/apache/webbeans/spi/BeanArchiveService", "BeanArchiveInformation", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "org/apache/openejb/assembler/classic/BeansInfo", "BDAInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", "org/apache/openejb/assembler/classic/BeansInfo", "ExclusionEntryInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "org/apache/webbeans/spi/BeanArchiveService", "BeanDiscoveryMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "beanArchiveInfo", "Ljava/util/Map;", "Ljava/util/Map<Ljava/net/URL;Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/cdi/OpenEJBBeanInfoService", "beanArchiveInfo", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBeanArchiveInfo", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/net/URL;Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/cdi/OpenEJBBeanInfoService", "beanArchiveInfo", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBeanArchiveInformation", "(Lorg/apache/openejb/assembler/classic/BeansInfo$BDAInfo;Lorg/apache/openejb/assembler/classic/BeansInfo;Ljava/lang/ClassLoader;)Lorg/apache/webbeans/xml/DefaultBeanArchiveInformation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "discoveryMode", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("ALL");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "discoveryMode", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo", "version", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitLdcInsn("1.0");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo", "version", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo", "discoveryMode", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/exception/WebBeansConfigurationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("beans.xml with version 1.1 and higher must declare a bean-discovery-mode!");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/exception/WebBeansConfigurationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "trim", "Z");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLdcInsn("TRIM");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/xml/DefaultBeanArchiveInformation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "uri", "Ljava/net/URI;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "toASCIIString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitLdcInsn("1.1");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/cdi/OpenEJBBeanInfoService", "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "org/apache/openejb/assembler/classic/BeansInfo", "java/lang/ClassLoader", "java/lang/String", "org/apache/webbeans/xml/DefaultBeanArchiveInformation"}, 1, new Object[] {"org/apache/webbeans/xml/DefaultBeanArchiveInformation"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo", "version", "Ljava/lang/String;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/cdi/OpenEJBBeanInfoService", "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "org/apache/openejb/assembler/classic/BeansInfo", "java/lang/ClassLoader", "java/lang/String", "org/apache/webbeans/xml/DefaultBeanArchiveInformation"}, 2, new Object[] {"org/apache/webbeans/xml/DefaultBeanArchiveInformation", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "setVersion", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "ENGLISH", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "(Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "valueOf", "(Ljava/lang/String;)Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "setBeanDiscoveryMode", "(Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "decorators", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "setDecorators", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "interceptors", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "setInterceptors", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "getAlternativeClasses", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "alternatives", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "getAlternativeStereotypes", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$BDAInfo", "stereotypeAlternatives", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo", "excludes", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", "exclusion", "Lorg/apache/openejb/assembler/classic/ExclusionInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ExclusionInfo", "availableClasses", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/cdi/OpenEJBBeanInfoService", "isClassAvailable", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", "exclusion", "Lorg/apache/openejb/assembler/classic/ExclusionInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ExclusionInfo", "notAvailableClasses", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label12 = new Label();
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/cdi/OpenEJBBeanInfoService", "isClassAvailable", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNE, label14);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", "exclusion", "Lorg/apache/openejb/assembler/classic/ExclusionInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ExclusionInfo", "systemPropertiesPresence", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label15 = new Label();
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label16);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNE, label17);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", "exclusion", "Lorg/apache/openejb/assembler/classic/ExclusionInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ExclusionInfo", "systemProperties", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "stringPropertyNames", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label18 = new Label();
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", "exclusion", "Lorg/apache/openejb/assembler/classic/ExclusionInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ExclusionInfo", "systemProperties", "Ljava/util/Properties;");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNE, label19);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/BeansInfo$ExclusionEntryInfo", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn(".*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "addClassExclude", "(Ljava/lang/String;)V", false);
Label label22 = new Label();
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn(".**");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label23);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "addPackageExclude", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/xml/DefaultBeanArchiveInformation", "addClassExclude", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "isClassAvailable", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBeanArchiveInformation", "(Ljava/net/URL;)Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/cdi/OpenEJBBeanInfoService", "beanArchiveInfo", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRegisteredBeanArchives", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/net/URL;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}