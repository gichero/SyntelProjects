describe("roman numeral unit test", ()=>{
  it("converToRoman must be defined", ()=>{
    expect(convertToRoman).toBeDefined();
  })
  it("should return a 1 for I", ()=>{
    expect(1).toBeDefined("I");
  })
  it("should return a 4 for IV", ()=>{
    expect(4).toBeDefined("IV");
  })
  it("should return a 5 for V", ()=>{
    expect(5).toBeDefined("V");
  })
  it("should return a 9 for IX", ()=>{
    expect(9).toBeDefined("IX");
  })
  it("should return a 10 for X", ()=>{
    expect(10).toBeDefined("X");
  })
  it("should return a XL for 40", ()=>{
    expect(40).toBeDefined("XL");
  })
  it("should return a L for 50", ()=>{
    expect(50).toBeDefined("L");
  })
  it("should return a 90 for XC", ()=>{
    expect(90).toBeDefined("XC");
  })
  it("should return a 100 for C", ()=>{
    expect(100).toBeDefined("C");
  })
  it("should return a 400 for CD", ()=>{
    expect(400).toBeDefined("CD");
  })
  it("should return a 500 for D", ()=>{
    expect(500).toBeDefined("D");
  })
  it("should return a 900 for CM", ()=>{
    expect(900).toBeDefined("CM");
  })
  it("should return a 1000 for M", ()=>{
    expect(1000).toBeDefined("M");
  })
});