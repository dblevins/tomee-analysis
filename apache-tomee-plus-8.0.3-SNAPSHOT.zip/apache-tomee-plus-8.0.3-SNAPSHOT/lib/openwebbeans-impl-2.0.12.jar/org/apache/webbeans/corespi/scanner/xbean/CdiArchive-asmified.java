package asm.org.apache.webbeans.corespi.scanner.xbean;
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
public class CdiArchiveDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", null, "java/lang/Object", new String[] { "org/apache/xbean/finder/archive/Archive" });

classWriter.visitInnerClass("org/apache/webbeans/corespi/scanner/xbean/CdiArchive$FoundClasses", "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "FoundClasses", ACC_PUBLIC | ACC_FINAL);

classWriter.visitInnerClass("org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "org/apache/webbeans/spi/BeanArchiveService", "BeanArchiveInformation", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/xbean/finder/archive/Archive$Entry", "org/apache/xbean/finder/archive/Archive", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "classesByUrl", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/webbeans/corespi/scanner/xbean/CdiArchive$FoundClasses;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/xbean/finder/archive/Archive;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/spi/BeanArchiveService;Ljava/lang/ClassLoader;Ljava/util/Map;Lorg/apache/xbean/finder/filter/Filter;Lorg/apache/xbean/finder/archive/Archive;)V", "(Lorg/apache/webbeans/spi/BeanArchiveService;Ljava/lang/ClassLoader;Ljava/util/Map<Ljava/lang/String;Ljava/net/URL;>;Lorg/apache/xbean/finder/filter/Filter;Lorg/apache/xbean/finder/archive/Archive;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "classesByUrl", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "org/apache/webbeans/spi/BeanArchiveService", "java/lang/ClassLoader", "java/util/Map", "org/apache/xbean/finder/filter/Filter", "org/apache/xbean/finder/archive/Archive", "java/util/Collection", Opcodes.INTEGER, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/BeanArchiveService", "getBeanArchiveInformation", "(Ljava/net/URL;)Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLdcInsn("openwebbeans");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "getProtocol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 12);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/archive/FilteredArchive");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 12);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "org/apache/webbeans/spi/BeanArchiveService", "java/lang/ClassLoader", "java/util/Map", "org/apache/xbean/finder/filter/Filter", "org/apache/xbean/finder/archive/Archive", "java/util/Collection", Opcodes.INTEGER, "java/util/Iterator", "java/net/URL", "java/util/List", "org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", Opcodes.INTEGER}, 2, new Object[] {label2, label2});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/archive/ClasspathArchive", "archive", "(Ljava/lang/ClassLoader;Ljava/net/URL;)Lorg/apache/xbean/finder/archive/Archive;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "org/apache/webbeans/spi/BeanArchiveService", "java/lang/ClassLoader", "java/util/Map", "org/apache/xbean/finder/filter/Filter", "org/apache/xbean/finder/archive/Archive", "java/util/Collection", Opcodes.INTEGER, "java/util/Iterator", "java/net/URL", "java/util/List", "org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", Opcodes.INTEGER}, 3, new Object[] {label2, label2, "org/apache/xbean/finder/archive/Archive"});
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "<init>", "(Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;Ljava/util/List;Lorg/apache/xbean/finder/filter/Filter;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/archive/FilteredArchive", "<init>", "(Lorg/apache/xbean/finder/archive/Archive;Lorg/apache/xbean/finder/filter/Filter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xbean/finder/archive/Archive"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "classesByUrl", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive$FoundClasses");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive$FoundClasses", "<init>", "(Lorg/apache/webbeans/corespi/scanner/xbean/CdiArchive;Ljava/net/URL;Ljava/util/Collection;Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "org/apache/webbeans/spi/BeanArchiveService", "java/lang/ClassLoader", "java/util/Map", "org/apache/xbean/finder/filter/Filter", "org/apache/xbean/finder/archive/Archive", "java/util/Collection", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/archive/FilteredArchive");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/archive/FilteredArchive", "<init>", "(Lorg/apache/xbean/finder/archive/Archive;Lorg/apache/xbean/finder/filter/Filter;)V", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/Collection"});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "org/apache/webbeans/spi/BeanArchiveService", "java/lang/ClassLoader", "java/util/Map", "org/apache/xbean/finder/filter/Filter", "org/apache/xbean/finder/archive/Archive", "java/util/Collection", Opcodes.INTEGER}, 2, new Object[] {"java/util/Collection", "org/apache/xbean/finder/archive/Archive"});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/archive/CompositeArchive");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/archive/CompositeArchive", "<init>", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "delegate", "Lorg/apache/xbean/finder/archive/Archive;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "classesByUrl", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/apache/webbeans/corespi/scanner/xbean/CdiArchive$FoundClasses;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "classesByUrl", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBytecode", "(Ljava/lang/String;)Ljava/io/InputStream;", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "delegate", "Lorg/apache/xbean/finder/archive/Archive;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xbean/finder/archive/Archive", "getBytecode", "(Ljava/lang/String;)Ljava/io/InputStream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/String;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "delegate", "Lorg/apache/xbean/finder/archive/Archive;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xbean/finder/archive/Archive", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/apache/xbean/finder/archive/Archive$Entry;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/CdiArchive", "delegate", "Lorg/apache/xbean/finder/archive/Archive;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xbean/finder/archive/Archive", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
