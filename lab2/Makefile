CXXFLAGS =	-O2 -g -Wall -fmessage-length=0

OBJS =		lab2.o

LIBS =

TARGET =	lab2.exe

$(TARGET):	$(OBJS)
	$(CXX) -o $(TARGET) $(OBJS) $(LIBS)

all:	$(TARGET)

clean:
	rm -f $(OBJS) $(TARGET)
