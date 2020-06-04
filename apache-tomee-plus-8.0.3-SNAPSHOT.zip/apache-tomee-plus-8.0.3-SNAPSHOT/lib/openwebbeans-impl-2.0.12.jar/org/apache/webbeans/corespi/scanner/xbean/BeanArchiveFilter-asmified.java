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
public class BeanArchiveFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", null, "java/lang/Object", new String[] { "org/apache/xbean/finder/filter/Filter" });

classWriter.visitInnerClass("org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "org/apache/webbeans/spi/BeanArchiveService", "BeanArchiveInformation", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "org/apache/webbeans/spi/BeanArchiveService", "BeanDiscoveryMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "beanArchiveInfo", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "scanNone", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "userFilter", "Lorg/apache/xbean/finder/filter/Filter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "urlClasses", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;Ljava/util/List;Lorg/apache/xbean/finder/filter/Filter;)V", "(Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;Ljava/util/List<Ljava/lang/String;>;Lorg/apache/xbean/finder/filter/Filter;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "beanArchiveInfo", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "urlClasses", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "userFilter", "Lorg/apache/xbean/finder/filter/Filter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "getBeanDiscoveryMode", "()Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "NONE", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "java/util/List", "org/apache/xbean/finder/filter/Filter", "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode"}, 1, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "java/util/List", "org/apache/xbean/finder/filter/Filter", "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode"}, 2, new Object[] {"org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "scanNone", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "accept", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "scanNone", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "userFilter", "Lorg/apache/xbean/finder/filter/Filter;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "userFilter", "Lorg/apache/xbean/finder/filter/Filter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xbean/finder/filter/Filter", "accept", "(Ljava/lang/String;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "beanArchiveInfo", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/BeanArchiveService$BeanArchiveInformation", "isClassExcluded", "(Ljava/lang/String;)Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/corespi/scanner/xbean/BeanArchiveFilter", "urlClasses", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
